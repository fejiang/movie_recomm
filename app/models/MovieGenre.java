
package models;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * This model stores the mappings between the Movie and Genre models. 
 */
public class MovieGenre {
    
    public Integer movieGenreId;
    public Integer movieId;
    public Integer genreId;
    
    public static List<Genre> getMovieGenres(Integer movieId) {
        List<Genre> genres = new ArrayList<>();
        if (movieId.intValue() == 1) {
            Genre genre = new Genre();
            genre.genreId = Integer.valueOf(1);
            genre.genreName = "action";
            genres.add(genre);
        } else if (movieId.intValue() == 2) {
            Genre genre = new Genre();
            genre.genreId = Integer.valueOf(2);
            genre.genreName = "drama";
            genres.add(genre);
        } else if (movieId.intValue() == 3) {
            Genre genre = new Genre();
            genre.genreId = Integer.valueOf(1);
            genre.genreName = "action";
            genres.add(genre);
            
            genre = new Genre();
            genre.genreId = Integer.valueOf(3);
            genre.genreName = "comedy";
            genres.add(genre);
        }
        
        return genres;
    }
}
