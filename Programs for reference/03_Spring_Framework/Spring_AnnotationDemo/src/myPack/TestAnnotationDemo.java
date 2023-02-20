package myPack;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestAnnotationDemo {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Employee.class);
		String empInfo = (String) ctx.getBean("displayInfo");
		System.out.println(empInfo);
		ctx.close();
				
		AnnotationConfigApplicationContext ctx1 = new AnnotationConfigApplicationContext(Department.class);
		String deptInfo = (String) ctx1.getBean("displayInfo");
		System.out.println(deptInfo);
		ctx1.close();
	}
}