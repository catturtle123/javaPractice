package tipAndTricks;

class Player{
	private String name;
	private static int count;
	
	public Player(String name) {
		super();
		this.name = name;
		count++;
	}

	public static int getCount() {
		return count;
	}
	
}

public class StaticMethod {
	public static void main(String[] args) {
		Player player1 = new Player("man");
		System.out.println(Player.getCount());
		Player player2 = new Player("woman");
		System.out.println(Player.getCount());
		System.out.println(Player.getCount());
	}
}
