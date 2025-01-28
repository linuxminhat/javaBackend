package review1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task extends Thread {
	int number;
	public Task(int number) {
		this.number=number;
	}
	public void run() {
		System.out.println("Task" + number + "started ");
		for(int i=number*100;i<=number*100+99;i++) {
			System.out.print(i);
		}
		System.out.println("Task" + number + "done");
	}
}

public class threadsRunner3 {
	public static void main(String[] args) {
		ExecutorService myService = Executors.newFixedThreadPool(2);
		myService.execute(new Task(1));
		myService.execute(new Task(2));
		myService.execute(new Task3());
	}
}
