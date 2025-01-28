package review1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task1 extends Thread {
	public void run() {
		System.out.println("Task1 : started !");
		for(int i=0;i<=5;i++) {
			System.out.print(i);
		}
		System.out.println();
		System.out.println("Task1 : ended !");
	}
}
class Task2 extends Thread {
	public void run() {
		System.out.println("Task2 : started !");
		for(int i=6;i<=10;i++) {
			System.out.print(i);
		}
		System.out.println();
		System.out.println("Task2 : ended !");
	}
}
class Task3 extends Thread {
	public void run() {
		System.out.println("Task3 : started !");
		for(int i=11;i<=15;i++) {
			System.out.print(i);
		}
		System.out.println();
		System.out.println("Task3 : ended !");
	}
}

public class threadsRunner {
	public static void main(String[] args) {
		ExecutorService executorRunner = Executors.newSingleThreadExecutor();
		executorRunner.execute(new Task1());
		executorRunner.execute(new Task2());
		executorRunner.execute(new Task3());
	}

}
