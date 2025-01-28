package executorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class executorServiceRunner3 {
	public static void main(String[] args) {
		ExecutorService executorSeviceRunner3 = Executors.newSingleThreadExecutor();
		executorSeviceRunner3.execute(new Task1());
		
	}

}
