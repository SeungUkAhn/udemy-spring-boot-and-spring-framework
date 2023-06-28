package com.maicoding.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person (String name, int age){}
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
        return new Person("Jake", 35);
    }

    @Bean
    public Address address(){
        return new Address("Baker Street", "London");
    }

//    @Bean
//    public String name(){
//        return "Mai";
//    }


}
