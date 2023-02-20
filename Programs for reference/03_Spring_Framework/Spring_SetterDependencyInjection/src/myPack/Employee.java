package myPack;

public class Employee{
	int id;
	String empName;
	String City;
	
	public int getId() {
		return id;
	}
	public String getEmpName() {
		return empName;
	}
	public String getCity() {
		return City;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public void setCity(String city) {
		City = city;
	}
	@Override
	public String toString() {
		return "Employee "
				+ "id=" + id + ", empName=" + empName + ", City=" + City + "]";
	}
	
	
	
	
}
