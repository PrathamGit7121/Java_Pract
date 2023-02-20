package myPackCollectionDependentObj;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args)
	{
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("appContextCollectionDependentObj.xml");
		
	    Question e=(Question)ctx.getBean("q1");
	    e.displayInfo();
	    ctx.close();
	    
	    }
}
