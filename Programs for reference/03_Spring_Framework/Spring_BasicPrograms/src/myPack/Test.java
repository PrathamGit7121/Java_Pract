package myPack;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String args[])
	{
		 
		   ApplicationContext ctx = new ClassPathXmlApplicationContext("AppContext_Message.xml");
		   Message m1 = (Message) ctx.getBean("obj1");
		   System.out.println(m1.getMsg());
	}
	  
	
}
