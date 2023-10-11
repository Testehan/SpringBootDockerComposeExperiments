package com.testehan.SpringBootDockerComposeExperiments.repository;

import com.testehan.SpringBootDockerComposeExperiments.model.Post;
import org.springframework.data.repository.ListCrudRepository;

public interface PostRepository extends ListCrudRepository<Post,Integer> {
}
