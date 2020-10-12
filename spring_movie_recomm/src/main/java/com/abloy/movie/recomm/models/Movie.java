package com.abloy.movie.recomm.models;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Movie {

	public Integer movieId;
    public String title;
    
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    public Date releaseDate;
    
    public String language;
    public Integer runtime;
    
    public List<Genre> genres;
    
    public static Movie getMovieById(Integer movieId) {
        Movie movie = null;
        SimpleDateFormat dateFormat =new SimpleDateFormat("yyyy-MM-dd");
        if (movieId.intValue() == 1) {
            try {
                movie = new Movie();
                movie.movieId = movieId;
                movie.language = "en";
                movie.releaseDate = dateFormat.parse("2020-03-01");
                movie.runtime = 100; //mins
                movie.title = "Movie 1";
                movie.genres = MovieGenre.getMovieGenres(movie.movieId);
            } catch (ParseException ex) {
                ex.printStackTrace();
                Logger.getLogger(Movie.class.getName()).log(Level.SEVERE, null, 
                        ex);
            }
        } else if (movieId.intValue() == 2) {
            try {
                movie = new Movie();
                movie.movieId = movieId;
                movie.language = "en";
                movie.releaseDate = dateFormat.parse("2020-01-01");
                movie.runtime = 80; //mins
                movie.title = "Movie 2";
                movie.genres = MovieGenre.getMovieGenres(movie.movieId);
            } catch (ParseException ex) {
                ex.printStackTrace();
                Logger.getLogger(Movie.class.getName()).log(Level.SEVERE, null, 
                        ex);
            }
        } else if (movieId.intValue() == 3) {
            try {
                movie = new Movie();
                movie.movieId = movieId;
                movie.language = "en";
                movie.releaseDate = dateFormat.parse("2020-07-01");
                movie.runtime = 90; //mins
                movie.title = "Movie 3";
                movie.genres = MovieGenre.getMovieGenres(movie.movieId);
            } catch (ParseException ex) {
                ex.printStackTrace();
                Logger.getLogger(Movie.class.getName()).log(Level.SEVERE, null, 
                        ex);
            }
        } 
        return movie;
    }
}
