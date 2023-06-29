package com.maicoding.learnspringframework.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person (String name, int age, Address address){}
record Address (String firstLine, String city){}

@Configuration
public class HelloWorldConfiguration {
    @Bean
    public String name(){
        return "Mai";
    }

    @Bean
    public int age(){
        return 30;
    }

    @Bean
    public Person person(){
        return new Person("Jake", 35, new Address("Mapo-gu", "Seoul"));
    }

    @Bean
    public Person person2MethodCall(){  //메서드 직접 호출을 이용한 bean 재활용
        return new Person(name(), age(), address());
    }

    @Bean
    public Person person3Parameters(String name, int age, Address address3){  //autowire를 이용한 bean 주입
        return new Person(name, age, address3);
    }

    @Bean
    @Primary
    public Person person4Parameters(String name, int age, Address address){  //autowire를 이용한 bean 주입
        return new Person(name, age, address);
    }

    @Bean(name = "address2")
    @Primary
    public Address address(){
        return new Address("Baker Street", "London");
    }

    @Bean(name = "address3")
    @Qualifier("address3qualifier")
    public Address address3(){
        return new Address("Jung-gu", "Seoul");
    }


}
