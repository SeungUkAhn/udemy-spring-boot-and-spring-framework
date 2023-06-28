package com.maicoding.learnspringframework;

import com.maicoding.learnspringframework.game.GameRunner;
import com.maicoding.learnspringframework.game.MarioGame;

public class AppGamingBasicJava {

    public static void main(String[] args) {
        var marioGame = new MarioGame();
        var gameRunner = new GameRunner(marioGame);
        gameRunner.run();
    }
}
