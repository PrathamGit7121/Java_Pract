package myPack;

import org.springframework.context.annotation.Bean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Department {
	@Value("7")
	private int id;
	
	@Value("MCA")
	private String name;
	
	@Bean
	public String displayInfo() {
		return "Department [id=" + id + ", name=" + name + "]";
	}
	
}