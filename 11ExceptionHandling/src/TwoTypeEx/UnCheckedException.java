package TwoTypeEx;

public class UnCheckedException {
	 public static void main(String[] args) {
	        int[] numbers = {1, 2, 3};
	        try {
	            System.out.println(numbers[5]); // Unchecked Exception: ArrayIndexOutOfBoundsException
	        } catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("An error occurred: " + e.getMessage());
	        }
	    }

}
