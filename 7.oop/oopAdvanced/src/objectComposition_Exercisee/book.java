package objectComposition_Exercisee;
public class book {
	public String id;
	public String name;
	public Author author;
	public Review review;
	//declare get and set 
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id=id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author=author;
	}
	public Review getReview() {
		return review;
	}
	public void setReview(Review review) {
		this.review=review;
	}
	//review this book 
	public void  reviewthisbook(int numb) {
		switch (numb) {
//			case 1 : return "Very Good";
		case 1 : 
			System.out.println("Very Good");
			break;
		case 2 : 
			System.out.println(" Good");
			break;
		case 3 : 
			System.out.println("Ok");
			break;
		case 4 : 
			System.out.println("Not Good");
			break;
		}
//		return "No review";
			
	}
	//declare constructor
	public book(String id,String name,Author author) {
		this.id=id;
		this.name=name;
		this.author=author;
		
	}
	
	//declare toString 
	public String toString() {
		return "Id of this book : " + " " + id + 
				"Name of this book : " + " " + name + 
				"Author of this book : " + " " + author + 
				"The review of this book " + " " + review;
	}
		
}