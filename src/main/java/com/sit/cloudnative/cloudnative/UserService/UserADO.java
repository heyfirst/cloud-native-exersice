package com.sit.cloudnative.cloudnative.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserADO implements UserADOInterface{

    @Autowired
    private JdbcTemplate jdbcTemplate;


    public User getUserById(int userId) {
        String sql = "SELECT id, firstname, lastname FROM users WHERE id = ?";
        User user = jdbcTemplate.queryForObject(sql, new UserRowMapper(), userId);
        return user;
    }

    public ArrayList<User> getAllUser() {
        String sql = "SELECT id, firstname, lastname FROM users";
        ArrayList<User> users = (ArrayList<User>) jdbcTemplate.query(sql, new UserRowMapper());
        return users;
    }
}
