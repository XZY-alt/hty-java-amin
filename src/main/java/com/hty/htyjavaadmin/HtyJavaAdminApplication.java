package com.hty.htyjavaadmin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
public class HtyJavaAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(HtyJavaAdminApplication.class, args);
    }
    @GetMapping("/cs")
    public  String findAll(){
        return "测试是否成功访问";
    }

}
