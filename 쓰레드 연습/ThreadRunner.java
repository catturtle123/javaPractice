package threadPractice;

class Task1 extends Thread{
	public void run() {
		System.out.print("\ntask1 start");
		for(int i = 101; i<=199; i++) {
			System.out.print(i+" ");
		}
		System.out.print("\n task 1 done");
	}
}

class Task2 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.print("\ntask2 start");
		for(int i = 201; i<=299; i++) {
			System.out.print(i+" ");
		}
		System.out.print("\n task 2 done");
	}
	
}

public class ThreadRunner {
	public static void main(String[] args) throws InterruptedException {
		
		
		System.out.print("\nstart1 ");
		Task1 task1 = new Task1();
		task1.setPriority(1);
		task1.start();
		
		System.out.print("\nstart2 ");
		Task2 task2 = new Task2();
		Thread task2Thread = new Thread(task2);
		task2Thread.setPriority(10);
		task2Thread.start();
		
		task1.join();
		task2Thread.join();
		
	
		System.out.print("\nstart3 ");
		for(int i = 301; i<=399; i++) {
			System.out.print(i+" ");
		}
		System.out.print("\n task3 done");
		
		System.out.print("\n main done");
	}
}
