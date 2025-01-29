package review2;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class CallableTask implements Callable<String> {
	String name;
	public CallableTask(String name) {
		this.name=name;
	}
	public String call() throws Exception{
		return "Hello" + name;
	}
}

public class CallableRunner1 {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService myService = Executors.newFixedThreadPool(2);
		Future<String> myOutput = myService.submit(new CallableTask("DangNhatMinh"));
		System.out.println(myOutput.get());
	}

}
