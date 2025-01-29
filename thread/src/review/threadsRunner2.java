package review;
class Task11 extends Thread {
	public void run() {
		System.out.println("Task11 started !");
		for(int i=0;i<=10;i++) {
			System.out.print(i);
		}
		System.out.println();
		System.out.println("Task11 ended !");
	}
}
class Task22 extends Thread {
	public void run() {
		System.out.println("Task22 started !");
		for(int i=11;i<=20;i++) {
			System.out.print(i);
		}
		System.out.println();
		System.out.println("Task22 ended !");
	}
}
class Task33 extends Thread{
	public void run() {
		System.out.println("Task33 started !");
		for(int i=21;i<=30;i++) {
			System.out.print(i);
		}
		System.out.println();
		System.out.println("Task33 ended !");
	}
}
class Task44 implements Runnable {
	public void run() {
		System.out.println("Task 44 started !");
		for(int i=31;i<=40;i++) {
			System.out.print(i);
		}
		System.out.println();
		System.out.println("Task 44 ended !");
	}
}
public class threadsRunner2 {
	public static void main(String[] args) throws InterruptedException {
		Task11 task1 = new Task11();
		Task22 task2 = new Task22();
		Task33 task3 = new Task33();
		Task44 task4 = new Task44();
		Thread task4Thread = new Thread(task4);
		task1.start();
		task1.join();
		task2.start();
		task3.start();
		task4Thread.start();
	}

}
