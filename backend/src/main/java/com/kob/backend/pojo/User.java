package com.kob.backend.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
//加入注解，方便操作
public class User {
    @TableId(type = IdType.AUTO)//让id自增需要增加的注解
    private Integer id;
    private String username;
    private String password;
    private String photo;
}
