package com.maicoding.springboot.learnjpaandhibernate.course.jdbc;

import com.maicoding.springboot.learnjpaandhibernate.course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {

    @Autowired
    private CourseJdbcRepository repository;

    @Override
    public void run(String... args) throws Exception{
        repository.insert(new Course(1, "Learn AWS Now!", "maicoding"));
        repository.insert(new Course(2, "Learn Azure Now!", "maicoding"));
        repository.insert(new Course(3, "Learn DevOps Now!", "maicoding"));
        repository.deleteById(1);
        System.out.println(repository.findById(2));
        System.out.println(repository.findById(3));
    }
}
