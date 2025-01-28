package review;
//extends Thread
//implements Runnable 
class Task1 extends Thread {
	public void run() {
		System.out.println("Task1 : Started !");
		for(int i=0;i<=100;i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("Task1 : Ended ! ");
	}
	
}
class Task2 extends Thread {
	public void run() {
		System.out.println("Task2 : Started !");
		for(int j=101;j<=200;j++) {
			System.out.print(j + "");
		}
		System.out.println();
		System.out.println("Task2 : Ended !");
	}
}


public class threadsRunner {
	public static void main(String[] args) {
		//Task1 
//		System.out.println("Task1 : Started !");
//		for(int i=0;i<=100;i++) {
//			System.out.print(i);
//		}
//		System.out.println("Task1 : Ended !");
//		//Task2 
//		System.out.println("Task2 : Started !");
//		for(int j=101;j<=200;j++) {
//			System.out.print(j);
//		}
//		System.out.println("Task2 : Ended !");
//		//Task3
//		System.out.println("Task3 : Started !");
//		for(int k=201;k<=300;k++) {
//			System.out.print(k);
//		} 
//		System.out.println("Task3 : Ended !");
		Task1 task1Runner = new Task1();
		Task2 task2Runner = new Task2();
		task1Runner.start();
		task2Runner.start();
	}

}
