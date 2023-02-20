package myPack;

import java.util.logging.Logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AOPEmployee {
	
	Logger log = Logger.getLogger("");

	@Pointcut("execution(* Employee.calcSalary (..))")  
    public void pointCutConfig1() { 
		
	}
	
	@After("pointCutConfig1()")//applying pointcut on after advice 
    public void logForSalCal(JoinPoint jp) {//it is advice (before advice)
        //System.out.println("additional concern - After Salary Calculation");
        log.info("additional concern 1 - After Salary Calculation");
        
    }
	
	@Pointcut("execution(* Employee.calcIncrement (..))")  
    public void pointCutConfig2() { 
		
	}
	@After("pointCutConfig2()")//applying pointcut on after advice 
    public void printMsg(JoinPoint jp) {//it is advice (after advice)
        //System.out.println("additional concern - from CalcIncrement()");  
        log.info("additional concern 2 - from CalcIncrement()");
        //System.out.println("Method Signature: "  + jp.getSignature());
    }
	
	@After("within(SalaryI+)")
	public void displayAll(JoinPoint jp)
	{
		System.out.println("additional concern 3 - for interface methods implemented by all class");
	}
	@After("target(IncrementI)")
	public void display(JoinPoint jp)
	{
		System.out.println("additional concern 4 - for interface methods implemented by all class");
	}

}
