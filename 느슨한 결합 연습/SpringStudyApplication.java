package com.in28minutes.springstudy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.in28minutes.springstudy.game.Game2;
import com.in28minutes.springstudy.game.GameRunner;
import com.in28minutes.springstudy.game.MarioGame;
import com.in28minutes.springstudy.game.Pacman;

@SpringBootApplication
public class SpringStudyApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SpringStudyApplication.class, args);
		
		//var game = new MarioGame();
		//var game = new Game2();
		var game = new Pacman();
		var gameRunner = new GameRunner(game);
	
	
		gameRunner.run();
	}

}
