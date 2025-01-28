package thread;

class Task1 extends Thread{

	@Override
	public void run() {
		System.out.println("Task1 started !");
		// TODO Auto-generated method stub
		for(int i=0;i<=10;i++) {
			System.out.print(i + " ");
		}
		System.out.println("Task1 ended !");
	}
	
}
class Task2  extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Task2 started !");
		for(int i=11;i<=20;i++) {
			System.out.print(i + " ");
		}
		System.out.println("Task2 ended !");
	}
	
}
class Task3  extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Task3 started !");
		for(int i=21;i<=30;i++) {
			System.out.print(i + " ");
		}
		System.out.println("Task3 ended !");
	}
	
}
public class threadsRunner1 {
	public static void main(String[] args) {
		Task1 myTask1 = new Task1();
		myTask1.setPriority(1);
		myTask1.start();
		Task2 myTask2 = new Task2();
		myTask2.setPriority(5);
		myTask2.start();
		Task3 myTask3 = new Task3();
		myTask3.setPriority(9);
		myTask3.start();
		
	}

}
