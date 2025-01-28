package fixedThreadPool;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

//create a task that have return value back 
class CallableTask1 implements Callable<String>{
	String name;
	public CallableTask1(String name) {
		this.name=name;
	}
	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		return "Hello" + name;
	}
	
}
public class callAbleRunner1 {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executorService1 = Executors.newFixedThreadPool(1);
		Future<String> myName = executorService1.submit(new CallableTask1("Dang Nhat Minh"));
		String myNameString = myName.get();
		System.out.println(myName.get());
		
	}
}
