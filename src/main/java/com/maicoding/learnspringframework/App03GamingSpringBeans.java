package com.maicoding.learnspringframework;

import com.maicoding.learnspringframework.game.GameRunner;
import com.maicoding.learnspringframework.game.GamingConsole;
import com.maicoding.learnspringframework.game.PacmanGame;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App03GamingSpringBeans {

    public static void main(String[] args) {

        try(var context = new AnnotationConfigApplicationContext(GamingConfiguration.class)){
            context.getBean(GamingConsole.class).up();
            context.getBean(GameRunner.class).run();
        }


        /*//var game = new MarioGame();
        //var game = new SuperContraGame();
        var game = new PacmanGame();            //1. 객체 생성
        var gameRunner = new GameRunner(game);  //2. 객체생성 및 의존성 결합: game은 gameRunner의 의존성임
        //gameRunner.run();*/
    }
}
