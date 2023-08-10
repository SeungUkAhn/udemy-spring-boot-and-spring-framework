package com.maicoding.learnspringframework.helloworld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {

    public static void main(String[] args) {
        //1. 스프링 컨텍스트 실행
        try(var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)){
            //2. 스프링이 알아서 처리하기 원하는 것들을 설정함 - @Configuration 어노테이션 사용
            System.out.println(context.getBean("name"));
            System.out.println(context.getBean("age"));
            System.out.println(context.getBean("person"));
            System.out.println(context.getBean("person2MethodCall"));
            System.out.println(context.getBean("person3Parameters"));
            System.out.println(context.getBean("address2"));
            System.out.println(context.getBean(Address.class));

            //스프링빈 전체리스트 출력하기
            //Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        }
    }
}
