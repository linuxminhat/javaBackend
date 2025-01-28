package review2;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class CallableTask2 implements Callable<String>{
	String myName;
	public CallableTask2(String myName) {
		this.myName=myName;
	}
	public String call() throws Exception{
		return "Hello" + " " + myName;
	}
}

public class CallableRunner3 {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService myService = Executors.newFixedThreadPool(1);
		Future<String> myResult = myService.submit(new CallableTask2("Dang Nhat Minh"));
		System.out.println(myResult.get());
	}
	
}
