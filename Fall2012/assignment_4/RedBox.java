// Tui Popenoe
// COP 3503 - Assignment 2
// RedBox.java
// ©2014

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
        for(int i = 0; i < this.videogames.length; i++){
            if(this.videogames[i].getTitle().equals(title)){
                return i;
            }
        }
        // Videogame not found
        return -1;
    }

    public int findMovieByTitle(String title){
        for(int i = 0; i < this.movies.length; i++){
            if(this.videogames[i].getTitle().equals(title)){
                return i;
            }
        }
        // Movie not found
        return -1;
    }

    public Videogame getVideogameByIndex(int index){
        if(index >= 0 && index < this.videogames.length){
            return this.videogames[index];
        }
        else{
            // Videogame not found
            return null;
        }
    }

    public Movie getMovieByIndex(int index){
        if(index >= 0 && index < this.movies.length){
            return this.movies[index];
        }
        else{
            // Movie not found
            return null;
        }
    }

    public void sortVideogamesByPopularity(){
        Arrays.sort(this.videogames, new Videogame());
    }

    public void sortVideogamesByTitle(){
        Arrays.sort(this.videogames);
    }

    public void sortVideogamesByRating(){
        Arrays.sort(this.videogames, new RatingComparison());
    }

    public void sortVideogamesByPlatform(){
        Arrays.sort(this.videogames, new VideogameComparison());
    }

    public void sortVideogamesByReleaseDate(){
        Arrays.sort(this.videogames, new DateComparison());
    }

    public void sortMoviesByPopularity(){
        Arrays.sort(this.movies, new Movie());
    }

    public void sortMoviesByTitle(){
        Arrays.sort(this.movies);
    }

    public void sortMoviesByRating(){
        Arrays.sort(this.movies, new RatingComparison());
    }

    public void sortMoviesByFormat(){
        Arrays.sort(this.movies, new MovieComparison());
    }

    public void sortMoviesByReleaseDate(){
        Arrays.sort(this.movies, new DateComparison());
    }

    public void printVideogames(){
        for(int i = 0; i < this.videogames.length; i++){
            System.out.println((i + 1) + ". " + this.videogames[i]);
        }
    }

    public void printMovies(){
        for(int i = 0; i < this.videogames.length; i++){
            System.out.println((i + 1) + ". " + this.movies[i]);
        }
    }

    public ArrayList<Integer> searchVideogamesInRange(double min, double max){

        ArrayList<Integer> videogameIndices = new ArrayList<Integer>;

        Videogame tempVideogame;
        double tempRating;

        for(int i = 0; i < this.videogames.size(); i++){
            tempVideogame = this.videogames.get(i);
            tempRating = tempVideogame.getAverageRating();
            if(tempRating >= min && tempRating <= max){
                videogameIndices.add(i);
            }
        }

        return videogameIndices;
    }

    public ArrayList<Integer> searchVideogamesInRangeSorted(double min,
        double max){
        int totalComparisons = 0;
        ArrayList<Integer> arrayIndices = new ArrayList<Integer>();

        }

    }

    public int insertionSort(boolean movieCheck){
        if(movieCheck){
            Movie[] tempArray = this.movies;
        }
        else{
            Videogame[] tempArray = this.videogames;
        }

        for(int i = 0; i < tempArray.length; i++){
            for(int j = i; j < tempArray.length; j++){
                if(tempArray[i] < tempArray[j]){
                    if(movieCheck){
                        Movie temp = tempArray[j];
                    }
                    else{
                        Videogame temp = tempArray[j];
                    }
                    tempArray[j] = tempArray[i];
                    tempArray[i] = temp;
                }
            }
        }
    }
}