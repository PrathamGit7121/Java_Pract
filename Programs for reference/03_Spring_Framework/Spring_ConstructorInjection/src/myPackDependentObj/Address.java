package myPackDependentObj;

public class Address {
	String houseNo;
	String buildingName;
	String city;
	String district;
	int pincode;
	
	public Address() {
		System.out.println("Default constructor invoked!");
	}
	
	
	public Address(String houseNo, String buildingName, String city, String district, int pincode) {
		this.houseNo = houseNo;
		this.buildingName = buildingName;
		this.city = city;
		this.district = district;
		this.pincode = pincode;
		
	}


	@Override
	public String toString() {
		return "Address houseNo=" + houseNo + ", buildingName=" + buildingName + ", city=" + city + ", district="
				+ district + ", pincode=" + pincode + " ";
	}

}
