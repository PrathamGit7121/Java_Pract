package myPackInheritance;;

public class Customer {
	
	
    int type;
    String action;    
    Person person;
	
	public Customer() {
	}

	
	public Customer(int type, String action,Person person) {
		this.type = type;
		this.action = action;
		this.person = person;
	}


	@Override
	public String toString() {
		return "Customer [person=" + person + ", type=" + type + ", action=" + action + "]";
	}

	
}