package callableRunner;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultiCallableRunner {

	public static void main(String[] args) throws InterruptedException, ExecutionException  {
		// TODO Auto-generated method stub
		ExecutorService executorService = Executors.newFixedThreadPool(3);
		
		List<CallTask> tasks = List.of(new CallTask("jh"),new CallTask("jg"),new CallTask("jd"));
		
		List<Future<String>> results = executorService.invokeAll(tasks);
	
		for(Future<String> result: results) {
			System.out.println(result.get());
		}
		
		executorService.shutdown();
	}

}
