package myPackDependentObj;

public class Employee {
	int eid;
	String ename;
	Address address;
	public Employee() {
		System.out.println("Default Constructor invoked!");
	}
	
	
	public Employee(int eid, String ename, Address address) {
		this.eid = eid;
		this.ename = ename;
		this.address = address;
	}


	public void display()
	{
		System.out.println(eid+" "+ename);
		System.out.println(address);
	}
}
