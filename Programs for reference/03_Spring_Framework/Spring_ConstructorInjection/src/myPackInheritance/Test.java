package myPackInheritance;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
	    
	   ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("appContextInheritance.xml");
	   Customer c2 = (Customer)ctx.getBean("cust2");
	   System.out.println(c2.toString());
	   ctx.close();
	}

}
