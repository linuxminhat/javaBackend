package Inheritance;

public class Address {
	public int zipcode;
	public String streetName;
	public String districtName;
	public String countryName;
	public boolean capitalorNot;
	public Address(int zipcode, String streetName, String districtName, String countryName) {
		this.zipcode=zipcode;
		this.streetName=streetName;
		this.districtName=districtName;
		this.countryName=countryName;
	}
	
}
