import static org.junit.Assert.assertEquals;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class WordCountTest {

    private static final List<String> LINES = Arrays.asList("lorem", "ipsum",
            "dolor", "sit", "amet", "lorem", "ipsum");
    private Path testFixtureFile;

    @Before
    public void setUp() throws Exception {
        testFixtureFile = Files.createTempFile("testWordCount", "txt");
        Files.write(testFixtureFile, LINES, Charset.defaultCharset());
    }

    @Test
    public void testExistingWordsShouldCountedCorrectly() throws Exception {
        assertEquals(2, WordCount.countLines("lorem", testFixtureFile));
    }

    @Test
    public void testExistingSubstringShouldCountedCorrectly() throws Exception {
        assertEquals(3, WordCount.countLines("lor", testFixtureFile));
    }

    @Test
    public void testNonExistingWordsShouldCountedCorrectly() throws Exception {
        assertEquals(0, WordCount.countLines("haha", testFixtureFile));
    }

    @Test

    @After
    public void tearDown() throws Exception {
        Files.delete(testFixtureFile);
    }
}