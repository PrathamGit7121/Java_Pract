package myPack;

import java.util.logging.Logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class TrackOperation {
	Logger log = Logger.getLogger("myLog");
	//Define advice method
	public void myadvice1(JoinPoint jp) { //it is advice  
        System.out.println("\n-------------additional concern 1 ----------\n");  
        log.info("User is in TrackOperation class - " + log.getName());  
    }
	
	public void myadvice2(JoinPoint jp) { //it is advice  
        System.out.println("\n-------------additional concern 2 ----------\n");  
        System.out.println("Method Signature: "  + jp.getSignature());  
    }
	
	public void myadvice3(JoinPoint jp,Object result)//it is advice (after advice)  
	{  
	    System.out.println("\n-------------additional concern 3 ----------\n");  
	    System.out.println("Method Signature: "  + jp.getSignature());  
	    System.out.println("Result in advice: "+result);  
	    System.out.println("end of after returning advice...");  
	} 
	
	 public Object myadvice4(ProceedingJoinPoint pjp) throws Throwable   
	    {  
	        System.out.println("----Additional Concern 4 < Before > calling actual method-----");  
	        Object obj=pjp.proceed();  
	        System.out.println("---Additional Concern 4 < After > calling actual method----");  
	        return obj;  
	    }  
	
	 public void myadvice5(JoinPoint jp,Throwable error)//it is advice  
	    {  
	        System.out.println("------additional concern 5 --------");  
	        System.out.println("Method Signature: "  + jp.getSignature());  
	        System.out.println("Exception is: "+error);  
	        System.out.println("end of after throwing advice...");  
	    }  
}