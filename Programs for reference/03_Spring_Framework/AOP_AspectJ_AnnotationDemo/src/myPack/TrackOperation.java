package myPack;

import java.util.logging.Logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class TrackOperation {
	Logger log = Logger.getLogger("myLog");
	
	@Pointcut("execution(* Operation.*(..))")  
    public void k1(){}	//pointcut name  
      
	@Pointcut("execution(* Operation.m*(..))")  
    public void k2(){}	//pointcut name  
	
	@Pointcut("execution(* Operation.k*(..))")  
    public void k3(){}	//pointcut name  
	
    @Before("k1()")//applying pointcut on before advice  
    public void myadvice1(JoinPoint jp)//it is advice (before advice)  
    {  
    	System.out.println("\n-------------additional concern 1 ----------\n");  
        log.info("User is in TrackOperation class - " + log.getName()); 
    }  
	
    @After("k2()")//applying pointcut on after advice  
    public void myadvice2(JoinPoint jp)//it is advice (after advice)  
    {  
    	System.out.println("\n-------------additional concern 2 ----------\n");  
        System.out.println("Method Signature: "  + jp.getSignature());   
    }  
    
    @AfterReturning(pointcut = "execution(* Operation.*(..))", returning= "result")  
             
    public void myadvice3(JoinPoint jp,Object result)//it is advice (after returning advice)  
    {  
    	System.out.println("\n-------------additional concern 3 ----------\n");  
	    System.out.println("Method Signature: "  + jp.getSignature());  
	    System.out.println("Result in advice: "+result);  
	    System.out.println("end of after returning advice...");   
    }  
		
    @Around("k3()")  
    public Object myadvice4(ProceedingJoinPoint pjp) throws Throwable   
    {  
    	System.out.println("----Additional Concern 4 < Before > calling actual method-----");  
        Object obj=pjp.proceed();  
        System.out.println("---Additional Concern 4 < After > calling actual method----");  
        return obj;    
    }  
	
	
	
    @AfterThrowing(pointcut = "k1()",throwing= "error")  
	 public void myadvice5(JoinPoint jp,Throwable error)//it is advice  
	    {  
	        System.out.println("------additional concern 5 --------");  
	        System.out.println("Method Signature: "  + jp.getSignature());  
	        System.out.println("Exception is: "+error);  
	        System.out.println("end of after throwing advice...");  
	    }  
}