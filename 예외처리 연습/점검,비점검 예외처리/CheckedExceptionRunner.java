package exceptionalRunner;

public class CheckedExceptionRunner {
	public static void main(String[] args) {
		method2();
	}

	private static void method1() throws InterruptedException {
		Thread.sleep(1000);
	}
	
	private static void method2() throws RuntimeException {
		
	}
	
}
