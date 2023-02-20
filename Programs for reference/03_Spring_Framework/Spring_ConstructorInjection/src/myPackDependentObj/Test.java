package myPackDependentObj;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		   ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("appContextDependentObj.xml");
		   Employee e1 = (Employee)ctx.getBean("emp1");
		   e1.display();
		   ctx.close();

	}

}
