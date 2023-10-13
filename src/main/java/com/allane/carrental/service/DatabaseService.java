package com.allane.carrental.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

//TODO remove this service
@Service
public class DatabaseService {
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public DatabaseService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public String checkDatabaseConnection() {
        try {
            jdbcTemplate.execute("SELECT 1");
            return "Database connection is successful!";
        } catch (Exception e) {
            return "Failed to connect to the database: " + e.getMessage();
        }
    }
}
