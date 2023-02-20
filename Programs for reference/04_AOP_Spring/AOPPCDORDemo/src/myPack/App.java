package myPack;

import org.springframework.context.ApplicationContext;  

import org.springframework.context.support.ClassPathXmlApplicationContext;  

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("AppConfig.xml");
		Student stud = (Student) context.getBean("studBean");
		StudOperation studOp = (StudOperation) context.getBean("studOpBean");  
				
		System.out.println("Calculating Total Marks & Grade...");
        int totalMarks = studOp.totalMarks(stud);
        String grade = studOp.getGrade(totalMarks);
        System.out.println(stud);
        System.out.println("\nTotal marks = " + totalMarks + " with grade: " + grade);
        
        System.out.println("\nMarks1 " + studOp.getMarks1(stud));
	}
}