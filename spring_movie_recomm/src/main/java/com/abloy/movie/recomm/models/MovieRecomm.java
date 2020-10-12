package com.abloy.movie.recomm.models;

import java.util.ArrayList;
import java.util.List;

public class MovieRecomm {
    
    public Integer recommId;
    public Integer userId;
    public Integer movieId;
    
    /**
     * Get all the recommended movie entries for the user. 
     * 
     * @param userId
     * @return the list of the recommended movie entries
     */
    public static List<Movie> getRecommMovieForUser(Integer userId) {
        List<Movie> recomMovieList = new ArrayList<>();
        if (userId.intValue() == 1) {
            Movie movie = Movie.getMovieById(Integer.valueOf(1));
            recomMovieList.add(movie);
            movie = Movie.getMovieById(Integer.valueOf(2));
            recomMovieList.add(movie);
            movie = Movie.getMovieById(Integer.valueOf(3));
            recomMovieList.add(movie);
        }
        return recomMovieList;
    }
}