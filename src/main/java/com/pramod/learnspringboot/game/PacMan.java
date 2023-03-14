package com.pramod.learnspringboot.game;

public class PacMan implements GameConsole{

	@Override
	public void up() {
		System.out.println("PacMan up");
	}

	@Override
	public void down() {
		System.out.println("PacMan down");
	}

	@Override
	public void right() {
		System.out.println("PacMan right");
	}

	@Override
	public void left() {
		System.out.println("PacMan left");
	}

}
