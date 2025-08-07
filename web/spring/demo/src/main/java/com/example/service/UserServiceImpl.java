package com.example.service;

import com.example.repository.UserRepository;

public class UserServiceImpl implements UserService{

    private UserRepository userRepository;

    @Override
    public boolean login_easy(String userId, String pw) {
        
        return userRepository.login_easy(userId, pw);
    }
    
}
