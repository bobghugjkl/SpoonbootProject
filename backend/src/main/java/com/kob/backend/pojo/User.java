package com.kob.backend.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
//加入注解，方便操作
public class User {
    private Integer id;
    private String username;
    private String password;
}
