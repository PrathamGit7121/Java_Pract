package myPackMap;

import org.springframework.context.support.ClassPathXmlApplicationContext;

@SuppressWarnings("deprecation")
public class Test {

	public static void main(String[] args) 
	{
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("appContextMap.xml");
		
	    Question e=(Question)ctx.getBean("q1");
	    e.displayInfo();
	    ctx.close();

	}

}
