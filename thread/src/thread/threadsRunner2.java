package thread;

class Task21 extends Thread {
	public  void run() {
		System.out.println("Task21 started ! ");
		for(int i=0;i<=10;i++) {
			System.out.println(i);
		}
		System.out.println();
		System.out.println("Task21 ended !");
	}
	
}
class Task22 extends Thread {
	public void run() {
		System.out.println("Task22 started ! ");
		for(int i=11;i<=20;i++) {
			System.out.println(i);
		}
		System.out.println();
		System.out.println("Task22 ended !");
	}
}
class Task23 extends Thread{
	public void run() {
		System.out.println("Task23 started !");
		for(int i=21;i<=30;i++) {
			System.out.println(i);
		}
		System.out.println();
		System.out.println("Task23 ended !");
	}
}
public class threadsRunner2 {
	public static void main(String[] args) {
		Task21 myTask21 = new Task21();
		Task22 myTask22 = new Task22();
		Task23 myTask23 = new Task23();
		myTask21.setPriority(1);
		myTask22.setPriority(6);
		myTask23.setPriority(9);
		myTask21.start();
		myTask22.start();
		myTask23.start();
		
	}
	

}
