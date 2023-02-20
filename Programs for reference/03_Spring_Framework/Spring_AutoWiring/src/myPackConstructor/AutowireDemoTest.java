package myPackConstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowireDemoTest {
	private static ApplicationContext ctx;
	
	public static void main(String[] args) {
		
		ctx=new ClassPathXmlApplicationContext("appContextConstructor.xml");
		
		Customer c1=(Customer)ctx.getBean("CustomerBean1");
		System.out.println(c1);
		
	}
}