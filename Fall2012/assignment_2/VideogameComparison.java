import java.util.Comparator;

public class VideogameComparison implements Comparator{
    public int compare(Videogame videogame1, Videogame videogame2){
        return String.compare(videogame1.getPlatform(),
         videogame2.getPlatform());
    }
}