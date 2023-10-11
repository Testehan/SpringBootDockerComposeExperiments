package com.testehan.SpringBootDockerComposeExperiments;

import com.testehan.SpringBootDockerComposeExperiments.model.Post;
import com.testehan.SpringBootDockerComposeExperiments.repository.PostRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MainApplication {

	public static void main(String[] args) {
		SpringApplication.run(MainApplication.class, args);
	}

	@Bean
	public CommandLineRunner createDummyData(PostRepository postRepository){
		return args -> postRepository.save(new Post("Hello world!","I am an alient coming to save your species."));
	}

}
