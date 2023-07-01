package com.maicoding.learnspringframework.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.maicoding.learnspringframework.game")
public class GamingAppLauncherApplication {
    public static void main(String[] args) {

        try(var context = new AnnotationConfigApplicationContext(GamingAppLauncherApplication.class)){
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
