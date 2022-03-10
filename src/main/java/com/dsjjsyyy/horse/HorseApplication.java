package com.dsjjsyyy.horse;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 罗日程
 */
@SpringBootApplication
@MapperScan("com.dsjjsyyy.horse.dao")
public class HorseApplication {

    public static void main(String[] args) {
        SpringApplication.run(HorseApplication.class, args);
    }

}
