package overriding_fixing;
/*
 * Ghi de phuong thuc trong java la khi lop con co phuong thuc giong voi lop cha 
 * -> Noi cach khac,neu lop con cung cap cai dat cu the cho phuong thuc da duoc co san boi lop cha 
 * => Ghi de phuong thuc = Overriding 
 */
public class runner {
	public static void main(String[] args) {
		car honda = new car();
		honda.run();
	}
/*
 * Các nguyên tắc ghi đè phương thức trong Java : 
 * 1/ Phương thức phải có tên giống với lớp cha 
 * 2/ Phương thức phải có tham số giống với lớp cha 
 * 3/ Lớp con kế thừa lớp cha 
 */
}
