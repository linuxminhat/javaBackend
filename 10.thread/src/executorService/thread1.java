package executorService;
class Task1 extends Thread {
	public void run() {
		System.out.println("Task1 starting !");
		for(int i=0;i<=10;i++) {
			System.out.print(i);
		}
		System.out.println();
		System.out.println("Task1 ending !");
	}
}
class Task2 extends Thread {
	public void run() {
		System.out.println("Task2 starting !");
		for(int j=11;j<=20;j++) {
			System.out.print(j);
		}
		System.out.println();
		System.out.println("Task2 ending !");
	}
}
class Task3 extends Thread {
	public void run() {
		System.out.print("Task3 starting !");
		for(int k=21;k<=30;k++) {
			System.out.print(k);
		}
		System.out.println();
		System.out.println("Task3 ending !");
	}
}
public class thread1 {
	

}
