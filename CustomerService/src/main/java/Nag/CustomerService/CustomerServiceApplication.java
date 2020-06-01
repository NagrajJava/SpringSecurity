package Nag.CustomerService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.client.RestTemplate;



/*
@Configuration
//@MapperScan("net.myproject.db")
@EnableTransactionManagement*/
@SpringBootApplication
public class CustomerServiceApplication {

	@Bean
	public RestTemplate getrestTemplate()
	{
		return new RestTemplate();
	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(CustomerServiceApplication.class, args);
		  System.out.println("Customer Service Started-------->Welcome");
	}
	
	
	}
