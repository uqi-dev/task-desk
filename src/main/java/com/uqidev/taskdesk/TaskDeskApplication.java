package com.uqidev.taskdesk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class TaskDeskApplication {

    public static void main(String[] args) {
        SpringApplication.run(TaskDeskApplication.class, args);
    }

}
