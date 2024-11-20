package variableArguments;

public class testingvariableArguments {
	//In java, variable  arguments meaning you can pass any arguments 
	public static int sum(int...numbers) {
		int total = 0;
		for(int number:numbers) {
			total+=number;
		}
		return total;
	}
	public static void main(String[] args) {
		System.out.println(sum(1,2));
		System.out.println(sum(1,2,3,4,5,6,7,8,9,10));
		 
		
	}

}
