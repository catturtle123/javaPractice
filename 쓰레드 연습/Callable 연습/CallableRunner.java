package callableRunner;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class CallTask implements Callable<String>{
	
	private String name;
	
	CallTask(String name){
		this.name = name;
	}
	
	@Override
	public String call() throws Exception {
		Thread.sleep(1000);
		return "Hello " + name;
	}
	
}

public class CallableRunner {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub
		ExecutorService executorService = Executors.newFixedThreadPool(1);
		
		Future<String> welcomeFuture = executorService.submit(new CallTask("jh"));
		System.out.println("start!");
		
		String welcomeMessage = welcomeFuture.get();
		System.out.println(welcomeMessage);
	
		System.out.println("end");
		
		executorService.shutdown();
	}

}
