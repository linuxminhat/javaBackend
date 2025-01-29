package fixedThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Taskkk extends Thread {
	int number;
	public Taskkk(int number) {
		this.number=number;
	}
	public void run() {
		System.out.println("Task" + " " + number + " " + "is starting ...");
		for(int i=10*number;i<=10*number+9;i++) {
			System.out.print(i);
		}
		System.out.println();
		System.out.println("Task" + " " + number + " " + "is ending ... ");
		
	}
}
public class fixedThreadPool3 {
	public static void main(String[] args) {
		Taskkk task1 = new Taskkk(1);
		Taskkk task2 = new Taskkk(2);
		Taskkk task3 = new Taskkk(3);
		ExecutorService taskExecutorService = Executors.newFixedThreadPool(3);
		taskExecutorService.execute(task1);
		taskExecutorService.execute(task2);
		taskExecutorService.execute(task3);
		
	}
	

}
