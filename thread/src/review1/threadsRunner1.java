package review1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task11 extends Thread {
	public void run() {
		System.out.println("Task1 : started !");
		for(int i=0;i<=10;i++) {
			System.out.print(i);
		}
		System.out.println();
		System.out.println("Task1 : ended !");
	}
}
class Task22 extends Thread {
	public void run() {
		System.out.println("Task2 : started !");
		for(int i=11;i<=20;i++) {
			System.out.print(i);
		}
		System.out.println();
		System.out.println("Task2 : ended !");
	}
}
class Task33 extends Thread {
	public void run() {
		System.out.println("Task3 : started !");
		for(int i=21;i<=30;i++) {
			System.out.print(i);
		}
		System.out.println();
		System.out.println("Task3 : ended !");
	}
}
public class threadsRunner1 {
	public static void main(String[] args) {
		ExecutorService ex1 = Executors.newSingleThreadExecutor();
		ex1.execute(new Task11());
		ex1.execute(new Task22());
		ex1.execute(new Task33());
	}

}
