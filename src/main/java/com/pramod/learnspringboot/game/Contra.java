package com.pramod.learnspringboot.game;

public class Contra implements GameConsole{

	public void up() {
		System.out.println("Turn up");
	}

	public void down() {
		System.out.println("escape from bullet");
	}

	public void right() {
		System.out.println("accelerate");
	}

	public void left() {
		System.out.println("turn back");
	}
}
