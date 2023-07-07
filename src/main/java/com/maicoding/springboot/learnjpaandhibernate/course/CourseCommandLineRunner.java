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
        repository.save(new Course(1, "Learn AWS Now!", "maicoding"));
        repository.save(new Course(2, "Learn Azure Now!", "maicoding"));
        repository.save(new Course(3, "Learn DevOps Now!", "maicoding"));
        repository.deleteById(1l);
        System.out.println(repository.findById(2l));
        System.out.println(repository.findById(3l));
    }
}
