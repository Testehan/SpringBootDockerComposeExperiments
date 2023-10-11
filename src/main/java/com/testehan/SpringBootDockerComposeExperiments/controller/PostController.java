package com.testehan.SpringBootDockerComposeExperiments.controller;

import com.testehan.SpringBootDockerComposeExperiments.model.Post;
import com.testehan.SpringBootDockerComposeExperiments.repository.PostRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/posts")
public class PostController {

    private PostRepository repository;

    public PostController(PostRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Post> findAll(){
        return repository.findAll();
    }
}
