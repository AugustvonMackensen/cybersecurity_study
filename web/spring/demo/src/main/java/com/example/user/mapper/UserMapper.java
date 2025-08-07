package com.example.user.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.example.user.vo.UserVo;

@Mapper
public interface UserMapper {
    int insertUser(UserVo user);
}
