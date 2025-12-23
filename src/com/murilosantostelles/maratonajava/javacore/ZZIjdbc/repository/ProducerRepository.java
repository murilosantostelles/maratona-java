package com.murilosantostelles.maratonajava.javacore.ZZIjdbc.repository;

import com.murilosantostelles.maratonajava.javacore.ZZIjdbc.conn.ConnectionFactory;
import com.murilosantostelles.maratonajava.javacore.ZZIjdbc.dominio.Producer;
import lombok.extern.log4j.Log4j2;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Log4j2 // uso do log4j2
public class ProducerRepository {
    public static void save(Producer producer){
        String sql = "INSERT INTO `anime_store`.`producer` (`name`) VALUES ('%s');".formatted(producer.getName());
        try(Connection conn = ConnectionFactory.getConnection();
            Statement stmt = conn.createStatement()) {
            int rowsAffected = stmt.executeUpdate(sql);
            System.out.println("Producer inserido no banco de dados: "+producer.getName()+" "+rowsAffected);
        } catch (SQLException e) {
            log.error("Error while trying to inset producer");
            throw new RuntimeException(e);
        }
    }

    public static void delete(int id){
        String sql = "DELETE FROM `anime_store`.`producer` WHERE (`id` = '%d');".formatted(id);
        try(Connection conn = ConnectionFactory.getConnection();
            Statement stmt = conn.createStatement()) {
            int rowsAffected = stmt.executeUpdate(sql);
            System.out.println("Producer deletado no banco de dados: "+id+" rows affected '"+rowsAffected+"'");
        } catch (SQLException e) {
            log.error("Error while trying to delete producer");
            throw new RuntimeException(e);
        }
    }



    public static void update(Producer producer){
        String sql = "UPDATE `anime_store`.`producer` SET `name` = '%s ' WHERE (`id` = '%d');".formatted(producer.getName(), producer.getId());
        try(Connection conn = ConnectionFactory.getConnection();
            Statement stmt = conn.createStatement()) {
            int rowsAffected = stmt.executeUpdate(sql);
            System.out.println("Producer atualizado no banco de dados: "+producer.getId()+" rows affected '"+rowsAffected+"'");
        } catch (SQLException e) {
            log.error("Error while trying to update producer");
            throw new RuntimeException(e);
        }
    }

    public static List<Producer> findAll(){
        System.out.println("Finding all Producers: ");
        String sql = "SELECT id, name FROM anime_store.producer;";
        List<Producer> producers = new ArrayList<>();
        try(Connection conn = ConnectionFactory.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()){
                var id = rs.getInt("id");
                var name = rs.getString("name");
                Producer producerObject = Producer.builder().id(id).name(name).build();
                producers.add(producerObject);
            }
        } catch (SQLException e) {
            log.error("Error while trying to find all producer");
            throw new RuntimeException(e);
        }
        return producers;
    }



    public static List<Producer> findByName(String name){
        System.out.println("Finding Producers by name: ");
        String sql = "SELECT * FROM producer WHERE name like '%s';".formatted("%"+name+"%");
        List<Producer> producers = new ArrayList<>();
        try(Connection conn = ConnectionFactory.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()){
                var id = rs.getInt("id");
                var nameProducer = rs.getString("name");
                Producer producerObject = Producer.builder().id(id).name(nameProducer).build();
                producers.add(producerObject);
            }
        } catch (SQLException e) {
            log.error("Error while trying to find all producer");
            throw new RuntimeException(e);
        }
        return producers;
    }

    public static void showProducerMetaData(){
        System.out.println("Showing Producer Metadata :");
        String sql = "SELECT * FROM anime_store.producer";
        try(Connection conn = ConnectionFactory.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql)) {
            ResultSetMetaData rsMetaData = rs.getMetaData();
            rs.next();
            int columnCount = rsMetaData.getColumnCount();
            System.out.println("Columns count: "+columnCount);
            for (int i = 1; i <= columnCount; i++){
                System.out.println("Table Name "+rsMetaData.getTableName(i));
                System.out.println("Column Name "+rsMetaData.getColumnName(i));
                System.out.println("Column Size "+rsMetaData.getColumnDisplaySize(i));
                System.out.println("Column Type "+rsMetaData.getColumnTypeName(i));
            }
        } catch (SQLException e) {
            log.error("Error while trying to find all producer");
            throw new RuntimeException(e);
        }
    }

    public static void showDriverMetaData(){
        System.out.println("Showing Driver Metadata :");
        try(Connection conn = ConnectionFactory.getConnection()){
            DatabaseMetaData dbMetaData = conn.getMetaData();
            if(dbMetaData.supportsResultSetType(ResultSet.TYPE_FORWARD_ONLY)){
                System.out.println("Supports TYPE_FORWARD_ONLY ");
                if(dbMetaData.supportsResultSetConcurrency(ResultSet.TYPE_FORWARD_ONLY,ResultSet.CONCUR_UPDATABLE)){
                    System.out.println("And supports CONCUR_UPDATABLE");
                }
            }
            if(dbMetaData.supportsResultSetType(ResultSet.TYPE_SCROLL_INSENSITIVE)){
                System.out.println("Supports TYPE_SCROLL_INSENSITIVE ");
                if(dbMetaData.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE)){
                    System.out.println("And supports CONCUR_UPDATABLE");
                }
            }
            if(dbMetaData.supportsResultSetType(ResultSet.TYPE_SCROLL_SENSITIVE)){
                System.out.println("Supports TYPE_SCROLL_SENSITIVE");
                if(dbMetaData.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE)){
                    System.out.println("And supports CONCUR_UPDATABLE");
                }
            }
        } catch (SQLException e) {
            log.error("Error while trying to find all producer");
            throw new RuntimeException(e);
        }
    }

    public static void showTypeScrollWorking(){
        String sql = "SELECT * FROM producer ;";
        try(Connection conn = ConnectionFactory.getConnection();
            Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = stmt.executeQuery(sql)) {
            System.out.println("Last row? '"+rs.last()+"'");
            System.out.println("Row Number? '"+rs.getRow()+"'");
            System.out.println(Producer.builder().id(rs.getInt("id")).name(rs.getString("name")).build());
        } catch (SQLException e) {
            log.error("Error while trying to find all producer");
            throw new RuntimeException(e);
        }
    }
}
