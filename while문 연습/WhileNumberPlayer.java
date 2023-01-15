package whileLoop;

public class WhileNumberPlayer {

	int number;

	public WhileNumberPlayer(int num) {
		// TODO Auto-generated constructor stub
		this.number = num;
	}

	public void printSquaresUptoLimit() {
		int num = 1;
		while (num * num <= this.number) {
			System.out.print(num * num + " ");
			num++;
		}
		System.out.println();
	}

	public void printCubesUptoLimit() {
		int num = 1;
		while (num * num * num <= this.number) {
			System.out.print(num * num * num + " ");
			num++;
		} // TODO Auto-generated method stub

	}

}
