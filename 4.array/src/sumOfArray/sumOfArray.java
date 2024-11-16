package sumOfArray;

public class sumOfArray {
	public static int[] array = {1,2,3,4,5,6,7,8,9,10};
	public int sumOfArray(int[] array) {
		this.array=array;
		int sum=0;
		for(int i=0;i<array.length;i++) {
			sum+=array[i];	
		}
		return sum;
	}
	public static void main(String[] args) {
		sumOfArray testcase = new sumOfArray();
		System.out.println(testcase.sumOfArray(array));
		
	}
}
