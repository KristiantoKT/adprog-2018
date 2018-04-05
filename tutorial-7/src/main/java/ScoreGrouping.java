import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 3rd exercise.
 */
public class ScoreGrouping {

    public static Map<Integer, List<String>> groupByScores(
            Map<String, Integer> scores) {

        Map<Integer, List<String>> byScores = new HashMap<>();

        for (String name : scores.keySet()) {
            int score = scores.get(name);

            List<String> names = new ArrayList<>();

            if (byScores.containsKey(score)) {
                names = byScores.get(score);
            }

            names.add(name);
            byScores.put(score, names);
        }

        return byScores;
    }

    public static void main(String[] args) {
        Map<String, Integer> scores = new HashMap<>();

        scores.put("Alice", 12);
        scores.put("Bob", 15);
        scores.put("Charlie", 11);
        scores.put("Delta", 15);
        scores.put("Emi", 15);
        scores.put("Foxtrot", 11);

        System.out.println(groupByScores(scores));
    }
}
