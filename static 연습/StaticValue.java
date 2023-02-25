package tipAndTricks;

class Player{
	private String name;
	private static int count;
	
	public Player(String name) {
		super();
		this.name = name;
		count++;
	}

	public int getCount() {
		return count;
	}
	
}

public class StaticValue {
	public static void main(String[] args) {
		Player player1 = new Player("man");
		System.out.println(player1.getCount());
		Player player2 = new Player("woman");
		System.out.println(player1.getCount());
		System.out.println(player2.getCount());
	}
}
