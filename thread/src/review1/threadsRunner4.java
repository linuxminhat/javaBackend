package review1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Tasks extends Thread {
	int number;
	public Tasks() {
		
	}
	public Tasks(int number) {
		this.number=number;
	}
	public void run() {
		System.out.println("Task" + number + "started" + " ");
		for(int i=number*100;i<=number*100+99;i++) {
			System.out.print(i);
		}
		System.out.println();
		System.out.println("Task" + number + "ended" + " ");
	}
}
public class threadsRunner4 {
	public static void main(String[] args) {
		ExecutorService myService = Executors.newFixedThreadPool(3);
		myService.execute(new Tasks(1));
		myService.execute(new Tasks(2));
		myService.execute(new Tasks(3));
		myService.execute(new Tasks(4));
		myService.execute(new Tasks(5));
		
		
	}
}
