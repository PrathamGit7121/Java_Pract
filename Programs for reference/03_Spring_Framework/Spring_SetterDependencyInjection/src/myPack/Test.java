package myPack;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {
	public static void main(String[] args)
	{
		//Resource r = new ClassPathResource("applicationContext.xml");

		//BeanFactory factory=new XmlBeanFactory(r);
		
		
	    //Employee e1=(Employee)factory.getBean("obj");
	   // System.out.println(e1.toString());
	    
	    
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
	    Employee e2 = (Employee)ctx.getBean("obj");
	    System.out.println(e2.toString());
	   
	    ((ClassPathXmlApplicationContext)ctx).close();
	    }
	}
