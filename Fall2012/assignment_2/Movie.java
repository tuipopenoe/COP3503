public class Movie extends Rental implements Cloneable{
    private String format;

    public Movie(){}

    public Movie(String title, String genre, double averageRating,
        int numTimesChecked, Date releaseDate, String format){
        super(1.0, title, genre, averageRating, numTimesChecked, releaseDate);
        this.format = format;
    }

    public String getFormat(){
        return this.format;
    }

    public void setFormat(String format){
        this.format = format;
    }

    public Object clone() throws CloneNotSupportedException{
        Movie clone = (Movie)super.clone();
        clone.format = this.format;

        return clone;
    }

    public String toString(){
        return (super.toString() + "Format: " + this.format);
    }
}