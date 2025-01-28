package arrrayIntermediate;

public class check2arrayifsame {
	static int[] array1 = {0,2,4,6,8,10};
	static int[] array2 = {1,3,5,7,9,0};
	public boolean checkTwoArray(int[] array1, int[] array2){
		for(int i=0;i<array1.length;i++) {
			for(int j=0;j<array2.length;j++) {
				if(array1[i]==array2[j]) {
					return true;
				}
			}
		}
		return false;
	}
	public static void main(String[] args) {
		check2arrayifsame testcase = new check2arrayifsame();
		System.out.println(testcase.checkTwoArray(array1, array2)); 
		
	}
}
