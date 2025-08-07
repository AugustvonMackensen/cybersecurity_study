package com.example.user.service;

import com.example.user.repository.UserRepository;
import com.example.user.vo.UserVo;

public class UserServiceImpl implements UserService{

    private UserRepository userRepository;

    @Override
    public boolean login_easy(String userId, String pw) {
        
        return userRepository.login_easy(userId, pw);
    }

    @Override
    public void signUp(UserVo user) {

        // Result
        int result = userRepository.insertUser(user);

        if(result > 0){
            System.out.println("Success!");
        }else {
            System.out.println("fail!");
        }
    }
    
}
