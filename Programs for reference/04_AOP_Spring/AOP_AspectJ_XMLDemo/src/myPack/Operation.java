package myPack;

public class Operation {
	public void msg(){
		System.out.println("\n msg method invoked!");
	}  
	
    public int m() {
    	System.out.println("\n m method invoked!");
    	return 2;
    }  
    
    public int k() {
    	System.out.println("\n k method invoked!");
    	return 3;
    } 
    
    public int divide(int a, int b)throws Exception
    {
    	return a/b;
    }
}