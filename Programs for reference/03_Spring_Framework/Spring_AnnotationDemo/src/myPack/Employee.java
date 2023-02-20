package myPack;

import org.springframework.context.annotation.Bean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;


@Configuration
public class Employee {
	@Value("101")
	private long id;
	@Value("Sachin")
	private String name;
	
	@Bean
	public String displayInfo() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
	
}