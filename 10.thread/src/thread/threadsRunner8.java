package thread;

class Task81 extends Thread { 
	public void run() {
		System.out.println("Task1 starting : ");
		for(int i=0;i<=10;i++) {
			System.out.print(i);
		}
		System.out.println();
		System.out.println("Task2 ending !");
	}
}
class Task82 extends Thread {
	public void run() {
		System.out.println("Task2 starting : ");
		for(int j=11;j<=20;j++) {
			System.out.print(j);
		}
		System.out.println();
		System.out.println("Task2 ending !");
	}
}
class Task83 extends Thread {
	public void run() {
		System.out.println("Task3 starting : ");
		for(int k=21;k<=30;k++) {
			System.out.print(k);
		}
		System.out.println();
		System.out.println("Task3 ending !");
	}
}
public class threadsRunner8 {
	public static void main(String[] args) throws InterruptedException {
		Task81 myTask81 = new Task81();
		Task82 myTask82 = new Task82();
		Task83 myTask83 = new Task83();
		myTask81.join();
	}

}
