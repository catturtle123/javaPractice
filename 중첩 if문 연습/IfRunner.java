package ifRunner;

import java.util.Scanner;

public class MenuRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Number1: ");
		int number1 = scanner.nextInt();
		System.out.print("Enter Number2: ");
		int number2 = scanner.nextInt();

		System.out.println("1 - Add");
		System.out.println("2 - Subtract");
		System.out.println("3 - Divide");
		System.out.println("4 - Multiply");
		System.out.print("Choose Operation: ");
		int choose = scanner.nextInt();
		
		printIf(number1, number2, choose);
	}

	private static void printIf(int number1, int number2, int choose) {
		if (choose == 1) {
			System.out.println("Result is - " + (number1 + number2));
		} else if (choose == 2) {
			System.out.println("Result is - " + (number1 - number2));
		} else if (choose == 3) {
			System.out.println("Result is - " + (number1 * number2));
		} else if (choose == 4) {
			System.out.println("Result is - " + (number1 / number2));
		}
	}

}
