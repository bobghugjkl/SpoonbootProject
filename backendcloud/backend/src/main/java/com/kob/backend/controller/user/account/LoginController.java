package com.kob.backend.controller.user.account;

import com.kob.backend.service.user.account.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class LoginController {
    @Autowired
    private LoginService loginService;

    //登录一般是post请求
    @PostMapping("/user/account/token/")//一定要记得放行，公开化
    public Map<String,String>getToken(@RequestParam Map<String,String>map){//固定写法
        String username = map.get("username");
        String password = map.get("password");
        return loginService.getToken(username,password);
    }
}
