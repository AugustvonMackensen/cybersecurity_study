package com.example.user.service;

import org.springframework.stereotype.Service;

import com.example.user.vo.UserVo;

@Service
public interface UserService{
    boolean login_easy(String userId, String pw);
    void signUp(UserVo user);
}