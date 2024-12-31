package obJectComposition_main;

public class customerRunner {
	public static void main(String[] args) {
//		public customer(String name,Address homeaddress) {
//		public Address(int zipcode, String StreetName,String DistrictName,String CityName) {
		Address homeaddress = new Address(5000,"Dang Dung","Lien Chieu","Da Nang");
		customer testcase = new customer("Dang Nhat Minh", 20, homeaddress);
		Address workaddress = new Address(5000,"30 thang 4","Son Tra","Da Nang");
		testcase.setWorkAddress(workaddress);
		System.out.println(testcase);
		
		
	}

}
