package game1;

public class GameRunner {
	public static void main(String[] args) {
		GamingConsole game = new MarioGame();
		game.up();
		game.down();
		game.right();
		game.left();
	}
}
