package Inheritance;

public class StudentRunner {
	public static void main(String[] args) {
//			public Student(String uniName, String majorName,int GPA) {
		Student student1 = new Student("DUT","CS",4);
//		public Address(int zipcode, String streetName, String districtName, String countryName) {
		Address addresss1 = new Address(5000,"DangDung","LienChieu","VietNam");
		System.out.println(student1.getAddress());
		
	}
}
