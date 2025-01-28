package bookPractice;

public class bookRunner extends book {
	public static void main(String[] args) {
		book cleanCode = new book();
		book artOfProgramming = new book();
		cleanCode.bookCheckAuthor();
		artOfProgramming.bookCheckAvailable();
	}

}
