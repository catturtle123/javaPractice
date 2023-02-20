package exceptionalRunner;

import java.util.Scanner;

public class FinallyRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = null;
		try {
		scanner = new Scanner(System.in);
		int[] numbers = {1,2,3,4,5};
		int number2 = numbers[5];
		
		}catch(Exception ex) {
			ex.printStackTrace();
		}finally {
			System.out.println("execute");
			if (scanner != null) {
				scanner.close();
			}
		}
		
		System.out.println("finish");
	}

}
