package com.wtx.storedprocedure;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.wtx.storedprocedure.mapper")
public class StoredprocedureApplication {

    public static void main(String[] args) {
        SpringApplication.run(StoredprocedureApplication.class, args);
    }

}
