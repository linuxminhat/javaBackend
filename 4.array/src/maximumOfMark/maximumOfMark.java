package maximumOfMark;

public class maximumOfMark {
	static int[] array = {23,11,53,67624,2121,442};
	
	public int getmaximumOfMark(int[] array) {
		this.array = array;
		int temp_maximum=array[0];
		for(int i=1;i<array.length;i++) {
			if(array[i]>temp_maximum) {
				temp_maximum = array[i];	 
			}
		}
		return temp_maximum;
	}
	public static void main(String[] args) {
		maximumOfMark testcase = new maximumOfMark();
		System.out.println(testcase.getmaximumOfMark(array));
	}

}
