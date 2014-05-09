import java.util.Arrays;
import java.util.ArrayList;

public class RedBox {
    private Videogame[] videogames;
    private Movie[] movies;
    private ArrayList<Customer> customers;

    public RedBox(Videogame[] videogames, Movie[] movies){
        this.videogames = videogames;
        this.movies = movies;
        this.customers = new ArrayList<Customer>();
    }
}