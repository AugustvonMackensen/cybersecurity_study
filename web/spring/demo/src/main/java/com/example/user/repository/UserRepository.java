package com.example.user.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.user.mapper.UserMapper;
import com.example.user.vo.UserVo;

@Repository
public class UserRepository {
    
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private UserMapper userMapper;
    
    public UserVo findByUsernameAndPassword(String username, String password) {
        // SQL Injection 취약!
        String sql = "SELECT * FROM users WHERE username = '" + username + "' AND password = '" + password + "'";
        try {
            return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(UserVo.class));
        } catch (EmptyResultDataAccessException e) {
            return null;
        }
    }

    public int insertUser(UserVo user){
        return userMapper.insertUser(user);
    }
}
