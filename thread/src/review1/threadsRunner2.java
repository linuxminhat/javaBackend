package review1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

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
		for(int i=6;i<=10;i++) {
			System.out.print(i);
		}
		System.out.println();
		System.out.println("Task2 : ended !");
	}
}
class Task333 extends Thread {
	public void run() {
		System.out.println("Task3 : started !");
		for(int i=11;i<=15;i++) {
			System.out.print(i);
		}
		System.out.println();
		System.out.println("Task3 : ended !");
	}
}
public class threadsRunner2 {
	public static void main(String[] args) {
		Task111 myTask1 = new Task111();
		myTask1.start();
		ExecutorService executorTask = Executors.newSingleThreadExecutor();
		executorTask.execute(new Task222());
		executorTask.execute(new Task333());
	}

}
