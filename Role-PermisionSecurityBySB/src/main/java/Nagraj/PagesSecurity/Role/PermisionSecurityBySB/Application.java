package Nagraj.PagesSecurity.Role.PermisionSecurityBySB;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		System.out.println("ROLE AND PERMISSION BASED SECURITY STARTED SUCCESSFULLY!!");
	}

}
