package objectComposition_Exercisee;

public class bookRunner {
	public static void main(String[] args) {
		//public Author(String name,byte sex,String nationality,boolean alive) {
		Author favAuthor1 = new Author("Nguyen Nhat Anh",(byte)0,"VietNam",true);
		Author favAuthor2 = new Author("Victor Hugo",(byte)0,"France",false);
		//public book(String id,String name,Author author) {
		book favBook1 = new book("102210039","Toi thay hoa vang tren co xanh",favAuthor1);
		book favBook2 = new book("102210030","Chien tranh va hoa binh",favAuthor2);
		favBook1.reviewthisbook(1);
		System.out.println(favBook1);
		System.out.println(favBook2);
	}

}
