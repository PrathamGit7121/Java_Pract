package myPack;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CircularDependencyTest {


	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx=null;
		try 
		{
			
			ctx= new ClassPathXmlApplicationContext("appContext.xml");
	        A objA = (A) ctx.getBean("a1");
	        
	        objA.doSomeThing();
			
		}
		catch(Exception e)
		{
			System.out.println("Exception Root Cause : "+e.getCause());
			System.out.println("\nException Stack Trace : ");
			e.printStackTrace();
			System.out.println("\nException Message : "+ e.getMessage());
		}
        finally
        {
        	if(ctx!=null)
        		{ ctx.close();}
        }
        
	}
}