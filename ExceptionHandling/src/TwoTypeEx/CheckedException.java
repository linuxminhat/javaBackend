package TwoTypeEx;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CheckedException {
	 public static void main(String[] args) {
	        try {
	            File file = new File("example.txt"); // Tệp có thể không tồn tại
	            FileReader fileReader = new FileReader(file); // Checked Exception: FileNotFoundException
	        } catch (IOException e) {
	            System.out.println("An error occurred: " + e.getMessage());
	        }
	    }
	

}
