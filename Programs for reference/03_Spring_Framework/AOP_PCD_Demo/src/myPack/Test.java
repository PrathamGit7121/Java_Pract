package myPack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Employee emp = (Employee) context.getBean("emp1");
		System.out.println("calling CalcSalary method...");
		int salary = emp.calcSalary();
	    System.out.println("\nGross Salary = " + salary);
	   
	    
	    System.out.println("\ncalling increment calculation method...");
	    int increment = emp.calcIncrement();
	    System.out.println("\nYour Increment is = " + increment);
	}
	
	

}
