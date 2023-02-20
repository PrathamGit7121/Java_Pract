package myPackDependentObj;

public class Address {
	String houseNo;
	String buildingName;
	String city;
	String District;
	int pincode;
	
	public String getHouseNo() {
		return houseNo;
	}
	
	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}
	
	public String getBuildingName() {
		return buildingName;
	}
	
	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getDistrict() {
		return District;
	}
	
	public void setDistrict(String district) {
		District = district;
	}
	
	public int getPincode() {
		return pincode;
	}
	
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [houseNo=" + houseNo + ", buildingName=" + buildingName + ", city=" + city + ", District="
				+ District + ", pincode=" + pincode + "]";
	}
	
	
	
	
	

}
