package com.maicoding.springboot.learnjpaandhibernate.course;

import com.maicoding.springboot.learnjpaandhibernate.course.springdatajpa.CourseSpringDataJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

//    @Autowired
//    private CourseJpaRepository repository;

    @Autowired
    private CourseSpringDataJpaRepository repository;

    @Override
    public void run(String... args) throws Exception{
        repository.save(new Course(1, "Learn AWS Jpa!", "maicoding"));
        repository.save(new Course(2, "Learn Azure Jpa!", "maicoding"));
        repository.save(new Course(3, "Learn DevOps Jpa!", "maicoding"));
        repository.deleteById(1l);
        System.out.println(repository.findById(2l));
        System.out.println(repository.findById(3l));

        System.out.println(repository.findAll());
        System.out.println(repository.count());

        System.out.println(repository.findByAuthor("maicoding"));
        System.out.println(repository.findByAuthor(""));

        System.out.println(repository.findByName("Learn AWS Jpa!"));
        System.out.println(repository.findByName("Learn DevOps Jpa!"));
    }
}
