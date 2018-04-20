package tutorial.javari.reader;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class CsvReader {
    private final Path file;
    protected final List<String> lines;

    public CsvReader(Path file) throws IOException {
        this.file = file;
        this.lines = Files.readAllLines(this.file, StandardCharsets.UTF_8);
    }

    public List<String> getLines(){
        return lines;
    }
}
