package myPack2;

public class BeanLifeCycle {
	String msg;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	
	public void customInit() {
	      System.out.println("Bean is going through inititialization!.");
	   }
	
	public void customDestroy() {
	      System.out.println("Bean will destroy now!");
	   }
	   
	@Override
	public String toString() {
		return "Message " + msg ;
	}
}
