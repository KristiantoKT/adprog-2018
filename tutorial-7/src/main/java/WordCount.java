import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * 2nd exercise.
 */
public class WordCount {

    public static long countLines(String word, Path file) throws IOException {
        long count = 0;

        BufferedReader reader = new BufferedReader(new FileReader(file.toString()));
        String line = null;

        while ((line = reader.readLine()) != null) {
            if (line.contains(word)) {
                count++;
            }
        }

        reader.close();

        return count;
    }

    public static void main(String[] args) {
        String word = "for";
        String filePath = "tutorial-7/aTextFile.txt";
        Path file = Paths.get("", filePath);

        try {
            long count = countLines(word, file);
            System.out.println(String.format("The word substring '%s' occurred in %d lines",
                    word, count));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
