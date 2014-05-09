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

    public Videogame[] getVideogames(){
        return this.videogames;
    }

    public void setVideogames(Videogame[] videogames){
        this.videogames = videogames;
    }

    public Movie[] getMovies(){
        return this.movies;
    }

    public void setMovies(Movie[] movies){
        this.movies = movies;
    }

    public ArrayList<Customer> getCustomers(){
        return this.customers;
    }

    public void setCustomers(ArrayList<Customer> customers){
        this.customers = customers;
    }

    public void addCustomer(Customer customer){
        this.customers.add(customer);
    }

    public int findVideogameByTitle(String title){
        for(int i = 0; i < this.videogames.length -1; i++){
            if(this.videogames[i].title.equals(title)){
                return i;
            }
        }
        // Videogame not found
        return -1;
    }

    public int findMovieByTitle(String title){
        for(int i = 0; i < this.movies.length -1; i++){
            if(this.videogames[i].title.equals(title)){
                return i;
            }
        }
        // Movie not found
        return -1;
    }

    public Videogame getVideogameByIndex(int index){
        if(index >= 0 && index < this.videogames.length-1){
            return this.videogames[index];
        }
        // Videogame not found
        return null;
    }

    public Movie getMovieByIndex(int index){
        if(index >= 0 && index < this.movies.length-1){
            return this.movies[index];
        }
        // Movie not found
        return null;
    }

    public void sortVideogamesByPopularity(){
        this.sortVideogames(this.videogames, "numTimesChecked", false);
    }

    public void sortVideogamesByTitle(){
        this.sortVideogames(this.videogames, "title", true);
    }

    public void sortVideogamesByRating(){
        this.sortVideogames(this.videogames, "averageRating", false);
    }

    public void sortVideogamesByPlatform(){
        this.sortVideogames(this.videogames, "platform", true);
    }

    public void sortVideogamesByReleaseDate(){
        this.sortVideogames(this.videogames, "releaseDate", false);
    }

    public void sortMoviesByPopularity(){
        this.sortMovies(this.movies, "numTimesChecked", false);
    }

    public void sortMoviesByTitle(){
        this.sortMovies(this.movies, "title", true);
    }

    public void sortMoviesByRating(){
        this.sortMovies(this.movies, "averageRating", false);
    }

    public void sortMoviesByFormat(){
        this.sortMovies(this.movies, "format", true);
    }

    public void sortMoviesByReleaseDate(){
        this.sortMovies(this.movies, "releaseDate", false);
    }

    public void printVideogames(){
        for(int i = 0; i < this.videogames.length-1; i++){
            this.videogames[i].toString();
        }
    }

    public void printMovies(){
        for(int i = 0; i < this.videogames.length-1; i++){
            this.videogames[i].toString();
        }
    }

    public void sortMovies(Movie[] array, String propertyName,
        boolean ascending){
        // TODO: use quicksort
        for(int i = 0; i < array.length -1; i++){
            for(int j = 0; j < array.length -1; j++){
                if(ascending){
                    if(array[i].propertyName >
                        array[j].propertyName){
                        Movie temp = array[j];
                        array[j] = array[i];
                        array[i] = temp;
                    }
                }
                else{
                    if(array[i].propertyName <
                       array[j].propertyName){
                        Movie temp = array[j];
                        array[j] = array[i];
                        array[i] = temp;
                    }
                }
            }
        }
    }

    public void sortVideogames(Videogame[] array, String propertyName,
        boolean ascending){
        // TODO: use quicksort
        for(int i = 0; i < array.length -1; i++){
            for(int j = 0; j < array.length -1; j++){
                if(ascending){
                    if(array[i].propertyName >
                        array[j].propertyName){
                        Videogame temp = array[j];
                        array[j] = array[i];
                        array[i] = temp;
                    }
                }
                else{
                    if(array[i].propertyName <
                       array[j].propertyName){
                        Videogame temp = array[j];
                        array[j] = array[i];
                        array[i] = temp;
                    }
                }
            }
        }
    }
}