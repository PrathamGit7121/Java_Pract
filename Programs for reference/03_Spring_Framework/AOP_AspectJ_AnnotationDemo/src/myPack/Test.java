package myPack;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");  
        Operation e = (Operation) ctx.getBean("opBean");  
        System.out.println("Defining the aspects, advices and pointcuts in AOP file.");  
        e.msg();  
        System.out.println("\n calling m...\n");  
        e.m();
        System.out.println("\n calling k...\n");  
        e.k();
        
        System.out.println("\n Calling divide()");
        try
        {e.divide(10, 2);
         e.divide(5,0);
        }
        catch(Exception ex)
        {
        	System.out.println(ex);
        }
        ((ClassPathXmlApplicationContext)ctx).close();
	}
}