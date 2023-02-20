package myPack2;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String args[])
	{
		 
		   AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("AppContext_BeanLifeCycle.xml");
		   BeanLifeCycle b1 = (BeanLifeCycle) ctx.getBean("obj1");
		   System.out.println(b1.getMsg());
		   ctx.registerShutdownHook();
		   ctx.close();
	}
	  
	
}
