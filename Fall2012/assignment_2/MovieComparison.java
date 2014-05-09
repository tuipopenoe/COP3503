import java.util.Comparator;

public class MovieComparison implements Comparator<Movie>{
    public int compare(Movie movie1, Movie movie2){
        return String.compare(movie1.getFormat(), movie2.getFormat());
    }
}