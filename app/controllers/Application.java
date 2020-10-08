package controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import play.mvc.*;

import java.util.*;

import models.*;

public class Application extends Controller {

    public static void index() {
        render();
    }
    
    public static void movieRecomm(String userId) {
        List<Movie> recommMovieList = MovieRecomm.getRecommMovieForUser(
                Integer.valueOf(userId));
        ObjectMapper objectMapper = new ObjectMapper();
        ObjectNode result = objectMapper.createObjectNode();
        result.put("userId", userId);
        ArrayNode recommMovieArr = result.putArray("movieRecomms");
        recommMovieList.forEach((movie) -> {
            recommMovieArr.add(objectMapper.valueToTree(movie));
        });
        renderJSON(result.toString());
    }

    //TODO: microservices
}