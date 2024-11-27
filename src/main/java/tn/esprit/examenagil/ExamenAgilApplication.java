package tn.esprit.examenagil;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class ExamenAgilApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExamenAgilApplication.class, args);
    }

}
