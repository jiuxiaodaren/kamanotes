package com.kama.notes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @ClassName NotesApplication
 * @Description ToDo
 * @Author Tong
 * @LastChangeDate 2024-12-16 11:08
 * @Version v1.0
 */

@EnableAsync
@EnableTransactionManagement
@SpringBootApplication
@EnableScheduling
public class NotesApplication {
    public static void main(String[] args) {
        SpringApplication.run(NotesApplication.class, args);
    }
}
