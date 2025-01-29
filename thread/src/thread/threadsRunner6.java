package thread;

class task61 implements Runnable{ 
	public void run() {
		System.out.println("task61 started !");
		for(int i=0;i<=10;i++) {
			System.out.print(i);
		}
		System.out.println("task61 ended !");
	}
}
class task62 implements Runnable{
	public void run() {
		System.out.println("task62 started !");
		for(int i=11;i<=20;i++) {
			System.out.println(i);
		}
		System.out.println("task62 ended !");
	}
}
public class threadsRunner6 {
	public static void main(String[] args) {
		task61 mytask61 = new task61();
		task62 mytask62 = new task62();
		Thread mytask61Thread = new Thread(mytask61);
		Thread mytask62Thread = new Thread(mytask62);
		mytask61Thread.setPriority(1);
		mytask62Thread.setPriority(8);
		mytask61Thread.run();
		mytask62Thread.run();
	}

}
