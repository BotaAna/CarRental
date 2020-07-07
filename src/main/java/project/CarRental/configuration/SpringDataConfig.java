package project.CarRental.configuration;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

    @Configuration
    @EnableJpaRepositories(basePackages = "project.CarRental.model.repository")
    @EntityScan(basePackages = "project.CarRental.model.entity")
    public class SpringDataConfig {
    }

