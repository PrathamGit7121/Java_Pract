package myPack;

public class Employee implements SalaryI, IncrementI{
	
	int eid;
	String ename;
	String designation;
	int basic;
	int salary;
	int increment;
	

	
	public int getEid() {
		return eid;
	}
	public String getEname() {
		return ename;
	}
	public String getDesignation() {
		return designation;
	}
	public int getBasic() {
		return basic;
	}
	public int getSalary() {
		return salary;
	}
	public int getIncrement() {
		return increment;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public void setBasic(int basic) {
		this.basic = basic;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public void setIncrement(int increment) {
		this.increment = increment;
	}
	
	
	
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", designation=" + designation + ", basic=" + basic + "]";
	}
	
	@Override
	public int calcIncrement() {
		System.out.println("Inside Increment calculation method....");
		int gradePay = 7000;
		int basicGP = basic + gradePay;
		increment = (int)((basicGP * 0.05)+(basicGP * 0.05));
		return  increment;
	}
	
	@Override
	public int calcSalary() {
		System.out.println("Inside salary calculation method....");
		// Salary = basic + Grade Pay + 80% DA + 10% HRA + 5%TA 
		int gradePay = 7000;
		int basicGP = basic + gradePay;
		return (int) (basicGP + (basicGP*0.8) + (basicGP*0.1) + (basicGP*0.5));
	}
	
	public void printSalary()
	{
		System.out.println("Salary = " + salary);
	}
	
	public void printIncrement()
	{
		System.out.println("Increment = " + increment);
	}
	

}
