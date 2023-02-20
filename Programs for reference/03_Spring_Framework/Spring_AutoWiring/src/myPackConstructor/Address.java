package myPackConstructor;

public class Address {
	int buildingNo;
	String street;
	String dist;
	long pin;

	
	
	public Address() {
	}

	public Address(int buildingNo, String street, String dist, long pin) {
		this.buildingNo = buildingNo;
		this.street = street;
		this.dist = dist;
		this.pin = pin;
		
	}

	@Override
	public String toString() {
		return "Address [buildingNo=" + buildingNo + ", street=" + street + ", dist=" + dist + ", pin=" + pin + "]";
	}
}

