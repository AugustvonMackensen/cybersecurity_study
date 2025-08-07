package com.example.vo;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@AllArgsConstructor
@Getter
@Setter
public class UserVo implements Serializable{
    private int id;
    private String username;
    private String password;
    private String email;
    private int role;
}
