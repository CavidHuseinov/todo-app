package com.example.todo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Connection;


@SpringBootApplication
public class TodoAppApplication {

    public static void main(String[] args) throws Exception {

        var context = SpringApplication.run(TodoAppApplication.class, args);

    }

}
