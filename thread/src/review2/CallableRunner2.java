package review2;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class CallableTask1 implements Callable<String>{
	String myName;
	public CallableTask1(String myName) {
		this.myName=myName;
	}
	public String call() throws Exception {
		return "Hello" + " " + myName;
		
	}
}

public class CallableRunner2 {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService myService1 = Executors.newFixedThreadPool(2);
		Future<String> myResult = myService1.submit(new CallableTask1("Dang Nhat Minh"));
		System.out.println(myResult.get());
	}

}
