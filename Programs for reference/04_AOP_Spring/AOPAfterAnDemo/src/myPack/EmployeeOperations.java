package myPack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeOperations {
	@Autowired
	public EmployeeOperations() {
		super();
	}

	public double calcSalary(double basic) {
		System.out.println("Inside salary calculation method....");
		// Salary = basic + Grade Pay + 80% DA + 10% HRA + 5%TA 
		basic=basic + 7000;
		return basic + (basic*0.8) + (basic*0.1) + (basic*0.5);
	}
	
	public int calcIncrement(double basic) {
		System.out.println("Inside Increment calculation method....");
		int gradePay=7000;
		basic = basic + gradePay;
		return (int)(basic * 0.05) ;
	}
	
	public String printDtls(Employee emp, double salary) {
		return "Employee [name=" + emp.name + ", designation=" + emp.designation + 
				", " + "dept=" + emp.dept + ", salary = " + salary + "]";
	}
}