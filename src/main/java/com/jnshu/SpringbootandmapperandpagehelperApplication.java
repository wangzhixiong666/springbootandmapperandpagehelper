package com.jnshu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author Mr_Wang
 */
@SpringBootApplication
@ServletComponentScan
@MapperScan("com.jnshu.mapper")
public class SpringbootandmapperandpagehelperApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringbootandmapperandpagehelperApplication.class, args);
    }
}

