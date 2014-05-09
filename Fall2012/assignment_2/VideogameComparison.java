import java.util.Comparator;

public class VideogameComparison implements Comparator<Videogame>{
    public int compare(Videogame videogame1, Videogame videogame2){
        return videogame1.getPlatform().compareTo(videogame2.getPlatform());
    }
}