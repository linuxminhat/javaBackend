package thread;

class task71 implements Runnable {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Task71 started !");
		for(int i=0;i<=10;i++) {
			System.out.print(i);
		}
		System.out.println("Task71 ended !");
	}
}
class task72 implements Runnable {
	public void run() {
		System.out.println("Task72 started !");
		for(int i=11;i<=20;i++) {
			System.out.println(i);
		}
		System.out.println("Task72 ended !");
	}
}
class task73 implements Runnable {
	public void run() {
		System.out.println("Task73 started !");
		for(int i=21;i<=30;i++) {
			System.out.println(i);
		}
		System.out.println("Task73 ended !");
	}
}

public class threadsRunner7 {
	public static void main(String[] args) {
		task71 mytask71 = new task71();
		Thread mytask71Thread = new Thread(mytask71);
		mytask71Thread.setPriority(9);
		mytask71Thread.start();
	}
}
