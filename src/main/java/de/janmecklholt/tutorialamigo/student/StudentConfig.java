package de.janmecklholt.tutorialamigo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
                  Student jan = new Student("Jan", LocalDate.parse("10.02.1981", DateTimeFormatter.ofPattern("dd.MM.yyyy")), "bohlok@gmx.de");
                  Student peter = new Student("Peter", LocalDate.parse("10.01.2004", DateTimeFormatter.ofPattern("dd.MM.yyyy")), "Peter@gmx.de");
            repository.saveAll(
                List.of(jan, peter)
            );
        };
    }

}
