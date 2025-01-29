package executorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class executorServiceRunner1 {
	public static void main(String[] args) {
		//Tao 1 thread pool chi co duy nhat 1 thread de thuc thi cac tac vu
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		//Gui task1 vao trong executorService
		executorService.execute(new Task1());
		//Tao doi tuong thread moi, va doi tuong nay nhan task2 
		executorService.execute(new Thread(new Task2()));
		
	}

}
