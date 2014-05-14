// Tui Popenoe
// COP 3503 - Assignment 2
// Videogame.java
// ©2014

public class Videogame extends Rental implements Cloneable{
    private String platform;

    public Videogame(){}

    public Videogame(String title, String genre, double averageRating,
        int numTimesChecked, Date releaseDate, String platform){
        super(2.0, title, genre, averageRating, numTimesChecked, releaseDate);
        setPlatform(platform);
    }

    public Videogame(String title, String genre, Date releaseDate,
        String platform){
        this(title, genre, 0, 0, releaseDate, platform);
    }

    public String getPlatform(){
        return this.platform;
    }

    public void setPlatform(String platform){
        this.platform = platform;
    }

    public Object clone() throws CloneNotSupportedException{
        Videogame clone = (Videogame) super.clone();
        clone.releaseDate = (Date)this.releaseDate.clone();

        return clone;
    }
}