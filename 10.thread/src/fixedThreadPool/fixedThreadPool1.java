package fixedThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task extends Thread {
	int number;
	Task(int number){
		this.number=number;
	}
	public void run() {
		System.out.println("Task" + " " + number + " " + "is starting ... ");
		for(int i=number;i<=number*10;i++) {
			System.out.print(i);
		}
		System.out.println();
		System.out.println("Task" + " " +number + " " + "is ending ... ");
	}
}
public class fixedThreadPool1 {
	public static void main(String[] args) {
		ExecutorService execute = Executors.newFixedThreadPool(2);
		Task task1 = new Task(1);
		Task task2 = new Task(2);
		Task task3 = new Task(3);
		Task task4 = new Task(4);
		Task task5 = new Task(5);
		execute.execute(task1);
        execute.execute(task2);
        execute.execute(task3);
        execute.execute(task4);
        execute.execute(task5);

        // Đóng thread pool sau khi hoàn thành tất cả các task
        execute.shutdown();
		
	}
}
