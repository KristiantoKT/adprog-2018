import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class ScoreGroupingTest {
    Map<String, Integer> scores = new HashMap<>();

    @Before
    public void setUp(){
        scores.put("Alice", 12);
        scores.put("Bob", 15);
        scores.put("Charlie", 11);
        scores.put("Delta", 15);
        scores.put("Emi", 15);
        scores.put("Foxtrot", 11);
    }

    @Test
    public void testForScoreGroupingTrue(){
        String expectedOutput = "{11=[Charlie, Foxtrot], 12=[Alice], 15=[Emi, Bob, Delta]}";
        assertEquals(expectedOutput, ScoreGrouping.groupByScores(scores).toString());
    }

    @Test
    public void checkMainFunction() {
        ScoreGrouping.main(new String[]{});
    }
}