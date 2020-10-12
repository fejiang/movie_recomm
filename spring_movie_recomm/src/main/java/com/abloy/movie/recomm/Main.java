package com.abloy.movie.recomm;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.abloy.movie.recomm.models.Movie;
import com.abloy.movie.recomm.models.MovieRecomm;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

@SpringBootApplication
@RestController
public class Main {

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}

	@RequestMapping(path = "/movierecomm/{userId}", method = RequestMethod.GET)
	public @ResponseBody ObjectNode movieRecomm(@PathVariable(value = "userId") 
		String userId) {
		List<Movie> recommMovieList = MovieRecomm.getRecommMovieForUser(
                Integer.valueOf(userId));
        ObjectMapper objectMapper = new ObjectMapper();
        ObjectNode result = objectMapper.createObjectNode();
        result.put("userId", userId);
        ArrayNode recommMovieArr = result.putArray("movieRecomms");
        recommMovieList.forEach((movie) -> {
            recommMovieArr.add(objectMapper.valueToTree(movie));
        });
        return result;
	}
}
