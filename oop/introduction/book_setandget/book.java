package book_setandget;

public class book {
	private int numbOfBook;
	private String nameOfBook;
	void setNumb(int numbOfBook) {
		this.numbOfBook = numbOfBook;
		System.out.println("The number of this book is " + numbOfBook);
	}
	void setName(String nameOfBook) {
		this.nameOfBook = nameOfBook;
		System.out.println("The name of this book is " + nameOfBook);
	}
	void bookNameChecking() {
		System.out.println("Checking name of this book");
	}

}
