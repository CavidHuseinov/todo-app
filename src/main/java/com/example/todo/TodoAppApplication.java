package com.example.todo;
import com.example.todo.config.DbConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Connection;


@SpringBootApplication
public class TodoAppApplication {

    public static void main(String[] args) throws Exception {

        var context = SpringApplication.run(TodoAppApplication.class, args);

        DbConfig dbConfig = context.getBean(DbConfig.class);
        try(Connection conn = dbConfig.getConnection()){
            if(conn !=null){
                System.out.println("Successfully Connection in database:"+ conn.getCatalog());
            }
        }
        catch (Exception ex){
            System.out.println("Can not connection in database" + ex.getMessage());
        }

    }

}
