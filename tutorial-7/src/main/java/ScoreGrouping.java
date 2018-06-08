import static java.util.stream.Collectors.groupingBy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 3rd exercise.
 */
public class ScoreGrouping {

    public static Map<Integer, List<String>> groupByScores(
            Map<String, Integer> scores) {
        return scores.keySet().stream().collect(groupingBy(scores::get));
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
