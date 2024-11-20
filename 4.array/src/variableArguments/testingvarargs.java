package variableArguments;

public class testingvarargs {
	private static int total = 0;
	public static int  calculating(int ...number) {
		
		for(int i:number) {
			total=total+i;
		}
		return total;
		
	}
	public static void main(String[] args) {
		System.out.println(calculating(1,2,3));
		System.out.println(calculating(100,99,98));
	}

}
