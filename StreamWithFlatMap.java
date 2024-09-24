package Streams;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * This class demonstrates how to use Java Streams with flatMap
 * to combine lists of names from different teams and filter them.
 */
public class StreamWithFlatMap {

    /**
     * The main method where the program starts.
     *
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {

        // List of names in Team Andromeda
        List<String> teamAndromeda = Arrays.asList("Brendan", "Anshul", "Anuj", "Charis");

        // List of names in Team Cygnus
        List<String> teamCygnus = Arrays.asList("Onder", "Shipra", "Arun", "Fernando");

        // List of names in Team Gamma
        List<String> teamGamma = Arrays.asList("Louis", "Tom", "Victor", "Mathis");

        // Consolidating all teams into a list of lists
        List<List<String>> consolidatedList = Arrays.asList(teamAndromeda, teamCygnus, teamGamma);

        // Flattening the list, filtering names longer than 4 letters, and collecting results
        List<String> flatMapList = consolidatedList.parallelStream()
                .flatMap(l->l.stream()) // Flattening the list of lists(Can replace l->l.stream() with Collection::stream)
                .filter(e -> e.length() > 4) // Keeping names longer than 4 letters
                .toList(); // Collecting the results into a new list

    }
}
