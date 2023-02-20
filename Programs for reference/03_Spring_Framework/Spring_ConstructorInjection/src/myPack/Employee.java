package myPack;

public class Employee {
	int eid;
	String ename;
	String address;
	public Employee() {
		System.out.println("Default Constructor invoked!");
	}
	public Employee(int eid) {
		
		this.eid = eid;
	}
	public Employee(String ename) {
		
		this.ename = ename;
	}
	public Employee(int eid, String ename) {
		
		this.eid = eid;
		this.ename = ename;
	}
	
	public Employee(int eid, String ename, String address) {
	
		this.eid = eid;
		this.ename = ename;
		this.address = address;
	}
	public void display()
	{
		System.out.println(eid+" "+ename+" "+address);
	}
}
