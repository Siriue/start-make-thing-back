package com.dlmu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.dlmu.Dao")
public class ZhouxuApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZhouxuApplication.class, args);
    }

}
