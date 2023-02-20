package myPackSetter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowireDemoTest {
	private static ApplicationContext ctx;
	
	public static void main(String[] args) {
		
		ctx=new ClassPathXmlApplicationContext("appContextSetter.xml");
		
		Customer c1=(Customer)ctx.getBean("CustomerBean1");
		System.out.println(c1);
		
		Customer c2=(Customer)ctx.getBean("CustomerBean2");
		System.out.println(c2);
		
		Customer c3=(Customer)ctx.getBean("CustomerBean3");
		System.out.println(c3);
		
	}
}

