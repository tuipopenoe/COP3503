import java.util.Comparator;

public abstract class Rental implements Comparable<Rental>, Comparator<Rental>{
    protected String title;
    protected String genre;
    protected double costPerDay;
    protected double averageRating;
    protected int numTimesChecked;
    protected boolean checkedOut;
    protected Date releaseDate;

    public Rental(){}

    public Rental(double costPerDay, String title, String genre,
        double averageRating, int numTimesChecked, Date releaseDate){
        this.costPerDay = costPerDay;
        this.title = title;
        this.genre = genre;
        this.averageRating = averageRating;
        this.numTimesChecked = numTimesChecked;
        this.releaseDate = releaseDate;
    }

    public Rental(double costPerDay, String title, String genre,
        Date releaseDate){
        this.costPerDay = costPerDay;
        this.title = title;
        this.genre = genre;
        this.releaseDate = releaseDate;
    }

    public String getTitle(){
        return this.title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getGenre(){
        return this.genre;
    }

    public void setGenre(String genre){
        this.genre = genre;
    }

    public double getCostPerDay(){
        return this.costPerDay;
    }

    public void setCostPerDay(double costPerDay){
        this.costPerDay = costPerDay;
    }

    public double getAverageRating(){
        return this.averageRating;
    }

    public void setAverageRating(double averageRating){
        this.averageRating = averageRating;
    }

    public int getNumTimesChecked(){
        return this.numTimesChecked;
    }

    public void setNumTimesChecked(int numTimesChecked){
        this.numTimesChecked = numTimesChecked;
    }

    public Date getReleaseDate(){
        return this.releaseDate;
    }

    public void setReleaseDate(Date releaseDate){
        this.releaseDate = releaseDate;
    }

    public boolean isCheckedOut(){
        return this.checkedOut;
    }

    public void checkOut(){
        this.checkedOut = true;
        this.numTimesChecked++;
    }

    public double checkIn(int numDays, double rating){
        this.checkedOut = false;
        this.averageRating =(((this.averageRating*numTimesChecked-1) + rating)
            / this.numTimesChecked);
        return numDays*this.costPerDay;
    }

    public int compareTo(Rental rental){
        return title.compareTo(rental.title);
    }

    public int compare(Rental rental1, Rental rental2){
        if(rental1.getAverageRating() < rental2.getAverageRating()){
            return 1;
        }
        else if(rental1.getAverageRating() == rental2.getAverageRating()){
            return 0;
        }
        else{
            return -1;
        }
    }

    public String toString(){
        return  this.title +
                "Genre: " + this.genre +
                "Release Date: " + this.genre +
                "Rating: " + this.averageRating +
                "Times Checked Out: " + this.numTimesChecked;
    }
}