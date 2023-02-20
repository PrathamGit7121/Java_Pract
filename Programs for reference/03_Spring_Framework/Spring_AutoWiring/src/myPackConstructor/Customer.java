package myPackConstructor;;

public class Customer {
	Person person;
	Address addr;
    int type;
    String action;
    
	public Customer() {
	}

	public Customer(Person person, Address addr, int type, String action) {
		this.person = person;
		this.addr = addr;
		this.type = type;
		this.action = action;
		
	}

	@Override
	public String toString() {
		return "Customer [person=" + person + ", addr=" + addr + ", type=" + type + ", action=" + action + "]";
	}

	
}

