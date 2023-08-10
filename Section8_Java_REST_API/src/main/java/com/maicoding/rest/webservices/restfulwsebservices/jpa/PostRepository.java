package com.maicoding.rest.webservices.restfulwsebservices.jpa;

import com.maicoding.rest.webservices.restfulwsebservices.user.Post;
import com.maicoding.rest.webservices.restfulwsebservices.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Integer> {

}
