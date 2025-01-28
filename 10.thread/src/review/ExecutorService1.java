package review;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorService1 {
	public static void main(String[] args) {
		//ExecutorService la Interface de quan li cac thread pool
		//Executors la lop tien ich (class)
		ExecutorService executorService1 = Executors.newSingleThreadExecutor();
		ExecutorService executorService2 = Executors.newSingleThreadExecutor();
		
	}

}
