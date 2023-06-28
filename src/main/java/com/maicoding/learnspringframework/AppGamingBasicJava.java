package com.maicoding.learnspringframework;

import com.maicoding.learnspringframework.game.GameRunner;
import com.maicoding.learnspringframework.game.MarioGame;
import com.maicoding.learnspringframework.game.PacmanGame;
import com.maicoding.learnspringframework.game.SuperContraGame;

public class AppGamingBasicJava {

    public static void main(String[] args) {
        //var game = new MarioGame();
        //var game = new SuperContraGame();
        var game = new PacmanGame();
        var gameRunner = new GameRunner(game);
        gameRunner.run();
    }
}
