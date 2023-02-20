package myPack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Operation {
	/*@Autowired
	public Operation() {
		super();
		System.out.println("Constructor is invoked!");
		
	}*/

	public void displayMsg() {
		System.out.println("This is a displayMsg method invoked...");
	}
	
	public int displayM() {
		System.out.println("This method diplays M and return 5 value!");
		return 5;
	}
    
	public int methodK() {
		System.out.println("methodK method invoked and return 3 value!");
		return 3;
	}
	
	public void printThis() {
		System.out.println("printThis() method invoked and return nothing...");
		//int a=5/0;
	}
}