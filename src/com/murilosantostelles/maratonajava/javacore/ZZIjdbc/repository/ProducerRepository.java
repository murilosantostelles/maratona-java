package com.murilosantostelles.maratonajava.javacore.ZZIjdbc.repository;

import com.murilosantostelles.maratonajava.javacore.ZZIjdbc.conn.ConnectionFactory;
import com.murilosantostelles.maratonajava.javacore.ZZIjdbc.dominio.Producer;
import lombok.extern.log4j.Log4j2;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

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
}
