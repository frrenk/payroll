package pl.piaseckif.payroll.utils;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.piaseckif.payroll.entity.Employee;
import pl.piaseckif.payroll.repository.EmployeeRepository;

@Configuration
@Slf4j
public class LoadDatabase {

    @Bean
    CommandLineRunner initDatabase(EmployeeRepository repository) {
        return args -> {
            log.info("Preloading "+repository.save(new Employee("Bilbo", "Baggins", "burglar")));
            log.info("Preloading "+repository.save(new Employee("Frodo", "Baggins", "thief")));
        };
    }
}
