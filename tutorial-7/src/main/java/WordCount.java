import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * 2nd exercise.
 */
public class WordCount {

    public static long countLines(String word, Path file) throws IOException {
        long count = Files.lines(file).filter(line -> line.contains(word)).count();
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
