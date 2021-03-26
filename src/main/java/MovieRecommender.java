import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;


public class MovieRecommender {
//    Array of movie times
//    flight time
//    2 movies to equal th
//    No movies fails
//    single movie fails
//    2 distinct movies that sum up to flight length
// [20, 30, 15,], 40
    public Boolean processMovies(Integer[] movies, Integer flightTime) {
        Set<Integer> movieHash = new HashSet<>();
        Integer diff = 0;
        for (Integer movie : movies) {
            diff = flightTime - movie;

            if (movieHash.contains(diff)) {
                return true;
            }
            else {
                movieHash.add(diff);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("INSIDE MAIN FUNCTION");
        MovieRecommender m = new MovieRecommender();
        if (m.processMovies(new Integer[]{}, 2)) throw new RuntimeException("False when no movies");
        if (m.processMovies(new Integer[]{ 2 }, 2)) throw new RuntimeException("False when no movies");
        if (!m.processMovies(new Integer[]{ 1, 1, 2, 3, 4 }, 2)) throw new RuntimeException("First two matches are valid");
        if (!m.processMovies(new Integer[]{ 1, 2, 3, 4, 1 }, 2)) throw new RuntimeException("First and last");
    }
}
