import java.util.Comparator;

public class RatingComparison implements Comparator<Rental>{
    public int compare(Rental rental1, Rental rental2){
        return rental1.getAverageRating() > rental2.getAverageRating() ? -1 :
            rental1.getAverageRating() == rental2.getAverageRating() ? 0 : 1;
    }
}