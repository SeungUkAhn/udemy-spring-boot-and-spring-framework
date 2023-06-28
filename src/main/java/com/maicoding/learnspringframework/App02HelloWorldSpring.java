package com.maicoding.learnspringframework;

import com.maicoding.learnspringframework.game.GameRunner;
import com.maicoding.learnspringframework.game.PacmanGame;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {

    public static void main(String[] args) {
        //1. 스프링 컨텍스트 실행
        var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
        //2. 스프링이 알아서 처리하기 원하는 것들을 설정함 - @Configuration 어노테이션 사용
        System.out.println(context.getBean("name"));

    }
}
