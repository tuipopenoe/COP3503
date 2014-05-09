import java.util.Comparator;

public class MovieComparison implements Comparator<Movie>{
    public int compare(Movie movie1, Movie movie2){
        return movie1.getFormat().compareTo(movie2.getFormat());
    }
}