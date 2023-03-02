package com.in28minutes.springstudy.game;

public class MarioGame implements GameConsole {
	public void up() {
		System.out.println("Jump");
	}
	
	public void down() {
		System.out.println("go to the hole");
	}
	
	public void left() {
		System.out.println("back");
	}
	
	public void right() {
		System.out.println("accerelate");
	}
}
