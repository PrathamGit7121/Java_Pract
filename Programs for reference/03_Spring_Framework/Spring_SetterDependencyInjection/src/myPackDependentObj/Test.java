package myPackDependentObj;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {
	public static void main(String[] args)
	{
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("appContextDependentObj.xml");
		Employee e = (Employee) ctx.getBean("obj");
		System.out.println(e.toString());
		
		ctx.close();
	}

}
