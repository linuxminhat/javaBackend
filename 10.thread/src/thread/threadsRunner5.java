package thread;

class task51 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Task51 started : ");
		for(int i=0; i<=10;i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("Task51 ended !");
	} 
	
}
class task52 implements Runnable{
	public void run() {
		System.out.println("Task52 started : ");
		for(int i=11;i<=20;i++) {
			System.out.print(i + "");
		}
		System.out.println();
		System.out.println("Task52 ended !");
	}
}
public class threadsRunner5 {
	public static void main(String[] args) {
		task51 mytask51 = new task51();
		task52 mytask52 = new task52();
		Thread mytask51Thread = new Thread(mytask51);
		Thread mytask52Thread = new Thread(mytask52);
		mytask51Thread.setPriority(1);
		mytask52Thread.setPriority(2);
		mytask51Thread.start();
		mytask52Thread.start();
	}

}
