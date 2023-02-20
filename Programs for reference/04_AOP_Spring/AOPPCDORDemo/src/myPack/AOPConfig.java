package myPack;

import java.util.logging.Logger;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class AOPConfig {
	Logger log = Logger.getLogger("studLog");
	/*

	@Before("execution(* StudOperation.totalMarks(..)) || execution(* StudOperation.getMarks*(..))")
    public void combineExpression() {
    	log.info("User is in StudOperation class - " + log.getName());
    }
    
    */
	
	@Before("within(myPack.*)")
    public void combineExpression() {
    	log.info("User is in StudOperation class - " + log.getName());
    }
	
	
}