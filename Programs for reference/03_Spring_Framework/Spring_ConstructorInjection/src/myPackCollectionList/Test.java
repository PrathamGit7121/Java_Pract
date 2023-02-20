package myPackCollectionList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
	    
	   ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("appContextCollectionList.xml");
	   Question q1 = (Question)ctx.getBean("ques1");
	  System.out.println(q1.toString());
	   ctx.close();

	}

}
