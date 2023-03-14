package com.pramod.learnspringboot;

import com.pramod.learnspringboot.game.Contra;
import com.pramod.learnspringboot.game.GameRunner;
import com.pramod.learnspringboot.game.Mario;
import com.pramod.learnspringboot.game.PacMan;

public class GameRunnerJava {

	public static void main(String[] args) {
		
		Mario mario = new Mario();
		Contra contra = new Contra();
		PacMan pacman = new PacMan();
		GameRunner gameRunner = new GameRunner(pacman);
		
		gameRunner.run();
	}

}
