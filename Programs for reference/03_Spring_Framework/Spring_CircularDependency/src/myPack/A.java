package myPack;

import org.springframework.context.annotation.Lazy;

public class A {
	B b;
	 
    public A() {
		
	}
	
    public A(B b) {
       
        this.b = b;
        
    }
 
    public B getB() {
        return b;
    }
    
    public void setB(B b) {
        this.b = b;
    }
 
    public void doSomeThing()
    {
        System.out.println("Doing some work in class A.");
    }
}