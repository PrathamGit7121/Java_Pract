package myPackDependentObj;

public class Employee {
	int id;
	String empName;
	Address address;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	/*@Override
	public String toString() {
		return "Employee [id=" + id + ", empName=" + empName + ", address=" + address + "]";
	}*/
	public String toString()
	{
		return " Employee Id = " +id + "\n Employee Name = "+empName+"\n"+ address;
	}
	
	

}
