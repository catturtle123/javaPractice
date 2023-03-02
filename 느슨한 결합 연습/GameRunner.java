package com.in28minutes.springstudy.game;

public class GameRunner {
	private GameConsole game;
	
	public GameRunner(GameConsole game) {
		// TODO Auto-generated constructor stub
		this.game = game;
	}
	
	public void run() {
		System.out.println("start: " + game);
		game.up();
		game.down();
		game.left();
		game.right();
	}

}
