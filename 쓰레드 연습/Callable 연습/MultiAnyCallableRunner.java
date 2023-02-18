package callableRunner;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultiAnyCallableRunner {

	public static void main(String[] args) throws InterruptedException, ExecutionException  {
		// TODO Auto-generated method stub
		ExecutorService executorService = Executors.newFixedThreadPool(3);
		List<CallTask> tasks = List.of(new CallTask("jh"),new CallTask("jg"),new CallTask("jd"));
		
		String result = executorService.invokeAny(tasks);
	
		System.out.println(result);
		
		executorService.shutdown();
	}

}
