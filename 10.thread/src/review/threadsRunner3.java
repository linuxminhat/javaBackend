package review;

class Task111 extends Thread {
	public void run() {
		System.out.println("Task1 : started !");
		for(int i=0;i<=5;i++) {
			System.out.print(i);
		}
		System.out.println();
		System.out.println("Task1 : ended !");
	}
}
class Task222 extends Thread {
	public void run() {
		System.out.println("Task2 : started !");
		for(int i=6;i<=11;i++) {
			System.out.print(i);
		}
		System.out.println();
		System.out.println("Task2 : ended !");
	}
}
class Task333 extends Thread {
	public void run() {
		System.out.println("Task3 : started !");
		for(int i=12;i<=17;i++) {
			System.out.print(i);
		}
		System.out.println();
		System.out.println("Task3 : ended !");
	}
}

public class threadsRunner3 {
	public static void main(String[] args) throws InterruptedException {
		Task111 myTask1 = new Task111();
		Task222 myTask2 = new Task222();
		Task333 myTask3 = new Task333();
		myTask1.start();
		myTask1.join();
		myTask2.start();
		myTask3.start();

		
	}

}
