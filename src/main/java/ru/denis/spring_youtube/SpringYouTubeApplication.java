package ru.denis.spring_youtube;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
public class SpringYouTubeApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringYouTubeApplication.class, args);
    }
}
