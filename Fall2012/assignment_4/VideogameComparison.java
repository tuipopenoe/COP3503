// Tui Popenoe
// COP 3503 - Assignment 2
// VideogameComparison.java
// ©2014

import java.util.Comparator;

public class VideogameComparison implements Comparator<Videogame>{
    public int compare(Videogame videogame1, Videogame videogame2){
        return videogame1.getPlatform().compareTo(videogame2.getPlatform());
    }
}