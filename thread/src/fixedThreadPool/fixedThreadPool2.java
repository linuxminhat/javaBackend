package fixedThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Taskk extends Thread {
	int number;
	public Taskk(int number) {
		this.number=number;
	}
	public void run() {
		System.out.println("Taskk" + " " + number + " " + "is starting :");
		for(int i=10*number; i<10*number+9;i++) {
			System.out.print(i);
		}
		System.out.println("Taskk" + "" + number + " " + "is ending !");
	}
}
public class fixedThreadPool2 {
	public static void main(String[] args) {
		Taskk task1 = new Taskk(1);//1 => 10
		Taskk task2 = new Taskk(2);//11 => 20
		Taskk task3 = new Taskk(3);//21 => 30
		ExecutorService taskService = Executors.newFixedThreadPool(2);
		taskService.execute(task1);
		taskService.execute(task2);
		taskService.execute(task3);
	}

}
