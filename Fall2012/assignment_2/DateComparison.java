import java.util.Comparator;

public class DateComparison implements Comparator<Rental>{
    public int compare(Rental rental1, Rental rental2){
        return rental1.compareTo(rental2);
    }
}