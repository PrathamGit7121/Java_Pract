package myPack;

import org.springframework.context.ApplicationContext;  
import org.springframework.context.support.ClassPathXmlApplicationContext;  

public class AOPEmpTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("empConfig.xml");
		Employee emp = (Employee) context.getBean("employee");
		EmployeeOperations empOp = (EmployeeOperations) context.getBean("employeeOperations");  
				
		System.out.println("calling CalcSalary method...");
        double salary = empOp.calcSalary(50000.00);
        System.out.println("\nGross Salary = " + salary);
        System.out.println("\nEmployee Dtls - " + empOp.printDtls(emp,salary));
        
        System.out.println("\ncalling increment calculation method...");
        int increment = empOp.calcIncrement(50000.00);
        System.out.println("\nYour Increment is = " + increment);
	}
}