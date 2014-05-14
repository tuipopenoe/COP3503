// Tui Popenoe
// COP 3503 - Assignment 2
// DateComparison.java
// ©2014

import java.util.Comparator;

public class DateComparison implements Comparator<Rental>{
    public int compare(Rental rental1, Rental rental2){
        return rental1.getReleaseDate().compareTo(rental2.getReleaseDate());
    }
}