package com.maicoding.learnspringframework.notinuse;

import com.maicoding.learnspringframework.game.GameRunner;
import com.maicoding.learnspringframework.game.PacmanGame;

public class App01GamingBasicJava {

    public static void main(String[] args) {
        //var game = new MarioGame();
        //var game = new SuperContraGame();
        var game = new PacmanGame();            //1. 객체 생성
        var gameRunner = new GameRunner(game);  //2. 객체생성 및 의존성 결합: game은 gameRunner의 의존성임
        //gameRunner.run();
    }
}
