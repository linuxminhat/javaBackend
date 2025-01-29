package executorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class executorServiceRunner2 {
	public static void main(String[] args) {
		ExecutorService executorServiceRunner2 = Executors.newSingleThreadExecutor();
		executorServiceRunner2.execute(new Task1());
	}

}
