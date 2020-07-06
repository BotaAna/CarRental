package project.CarRental.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "project.CarRental")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
