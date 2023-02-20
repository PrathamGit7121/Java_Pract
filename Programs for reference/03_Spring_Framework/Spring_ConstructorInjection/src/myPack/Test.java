package myPack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
	    
	   ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("appContextEmp.xml");
	   Employee e1 = (Employee)ctx.getBean("emp1");
	   e1.display();
	   ctx.close();

	}

}
