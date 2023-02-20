package myPack;

import org.springframework.context.ApplicationContext;  
import org.springframework.context.support.ClassPathXmlApplicationContext;  

public class Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");  
        A a1 = (A) ctx.getBean("obj");  
        
        System.out.println("AOP using old style.");  
        a1.m();
        
        ((ClassPathXmlApplicationContext)ctx).close();
	}
}