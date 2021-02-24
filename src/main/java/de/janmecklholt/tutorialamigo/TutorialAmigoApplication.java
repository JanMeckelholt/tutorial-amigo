package de.janmecklholt.tutorialamigo;

import de.janmecklholt.tutorialamigo.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

@SpringBootApplication
public class TutorialAmigoApplication {

    public static void main(String[] args) {
        SpringApplication.run(TutorialAmigoApplication.class, args);
    }


}
