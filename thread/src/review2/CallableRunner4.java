package review2;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


class CallTask3 implements Callable<String>{
	String myName;
	public CallTask3(String myName) {
		this.myName=myName;
	}
	public String call() throws Exception{
		return "Hello" + " " + myName;
	}	
}

public class CallableRunner4 {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService myService = Executors.newFixedThreadPool(2);
		Future<String> myResult = myService.submit(new CallTask3("Dang Nhat Minh"));
		System.out.println(myResult.get());
	}

}
