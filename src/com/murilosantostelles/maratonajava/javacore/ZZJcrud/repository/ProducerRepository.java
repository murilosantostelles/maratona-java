package com.murilosantostelles.maratonajava.javacore.ZZJcrud.repository;


import com.murilosantostelles.maratonajava.javacore.ZZJcrud.conn.ConnectionFactory;
import com.murilosantostelles.maratonajava.javacore.ZZJcrud.dominio.Producer;
import lombok.extern.log4j.Log4j2;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Log4j2
public class ProducerRepository {
    public static List<Producer> findByName(String name) {
        System.out.println("Finding Producers by name: " + name);
        List<Producer> producers = new ArrayList<>();
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = createPrepareStatementFindByName(conn, name);
             ResultSet rs = ps.executeQuery();) {
            while (rs.next()) {
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

    private static PreparedStatement createPrepareStatementFindByName(Connection conn, String name) throws SQLException {
        String sql = "SELECT * FROM anime_store.producer where name like ?;";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, String.format("%%%s%%", name));
        return ps;
    }

    public static void delete(int id) {
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = createPrepareStatementDelete(conn, id)) {
            ps.execute();
            log.info("Deleted producer '{}' from the database", id);
        } catch (SQLException e) {
            log.error("Error while trying to delete producer '{}'", id, e);
        }
    }

    private static PreparedStatement createPrepareStatementDelete(Connection conn, Integer id) throws SQLException {
        String sql = "SELECT * FROM anime_store.producer where name like ?;";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, id);
        return ps;
    }
}
