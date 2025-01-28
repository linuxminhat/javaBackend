package obJectComposition_main;

public class Address {
	public int zipcode;
	public String StreetName;
	public String DistrictName;
	public String CityName;
	public boolean capitalorNot;
	public Address(int zipcode, String StreetName,String DistrictName,String CityName) {
		super();
		this.zipcode=zipcode;
		this.StreetName=StreetName;
		this.DistrictName=DistrictName;
		this.CityName=CityName;
	}
	

}
