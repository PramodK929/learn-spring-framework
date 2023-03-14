package com.pramod.learnspringboot.game;

public class Mario implements GameConsole{
	public void up() {
		System.out.println("Jump");
	}

	public void down() {
		System.out.println("sit");
	}

	public void right() {
		System.out.println("move ahead");
	}

	public void left() {
		System.out.println("move back");
	}

}
