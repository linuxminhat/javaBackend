package thread;
class Task31 extends Thread{
	public void  run() {
		System.out.print("Task31 started  : ");
		for(int i=0;i<=10;i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("Task31 ended !");
	}
	
}
class Task32 extends Thread {
	public void run() {
		System.out.print("Task32 started : ");
		for(int i=11;i<=20;i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("Task32 ended !");
	}
}
public class threadsRunner3 {
	public static void main(String[] args) {
		Task31 myTask31 = new Task31();
		Task32 myTask32 = new Task32();
		myTask31.setPriority(2);
		myTask32.setPriority(4);
		myTask31.run();
		myTask32.run();
	}

}
