package com.maicoding.springboot.learnjpaandhibernate.course.springdatajpa;

import com.maicoding.springboot.learnjpaandhibernate.course.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseSpringDataJpaRepository extends JpaRepository <Course, Long>{

}
