package review;

class TaskRunnable1 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("TaskRunnable1 started !");
		for(int i=0;i<=100;i++) {
			System.out.print(i);
		}
		System.out.println();
		System.out.println("TaskRunnable1 ended !");
	}
	
}
class TaskRunnable2 implements Runnable {
	public void run() {
		System.out.println("TaskRunnable2 started !");
		for(int j=101;j<=200;j++) {
			System.out.print(j);
		}
		System.out.println();
		System.out.println("TaskRunnable2 ended !");
	}
}
public class threadsRunner1 {
	public static void main(String[] args) {
		TaskRunnable1 myTaskRunnable1 = new TaskRunnable1();
		Thread myThread1 = new Thread(myTaskRunnable1);
		myThread1.start();
		TaskRunnable2 myTaskRunnable2 = new TaskRunnable2();
		Thread myThread2 = new Thread(myTaskRunnable2);
		myThread2.start();
		myThread1.setPriority(Thread.MIN_PRIORITY);
		myThread2.setPriority(Thread.MAX_PRIORITY);
	}
	

}
