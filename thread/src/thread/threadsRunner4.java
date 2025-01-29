package thread;

class task41 implements Runnable {
	public void run() {
		System.out.println("Task41 started !");
		for(int i=0;i<=10;i++) {
			System.out.print(i);
		}
		System.out.println();
		System.out.println("Task41 ended !");
	}
}
class task42 implements Runnable {
	public void run() {
		System.out.println("Task42 started !");
		for(int i=11;i<=20;i++) {
			System.out.println(i);
		}
		System.out.println();
		System.out.println("Task42 ended !");
	}
}
class task43 implements Runnable {
	public void run() {
		System.out.println("Task43 started !");
		for(int i=21;i<=30;i++) {
			System.out.println(i);
		}
		System.out.println();
		System.out.println("Task43 ended !");
	}
}
public class threadsRunner4 {
	public static void main(String[] args) {
		task41 mytask41 = new task41();
		Thread mytask41Thread = new Thread(mytask41);
		task42 mytask42 = new task42();
		Thread mytask42Thread = new Thread(mytask42);
		task43 mytask43 = new task43();
		Thread mytask43Thread = new Thread(mytask43);
		mytask41Thread.setPriority(1);
		mytask42Thread.setPriority(2);
		mytask43Thread.setPriority(6);
		mytask41Thread.start();
		mytask42Thread.start();
		mytask43Thread.start();
		
	}

}
