import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

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
        fail("TODO Implement me!");
        // Given a substring that occurred 3 times (i.e. 'lor') in test fixture
        // When countLines is invoked
        // It should return 3
    }

    @Test
    public void testNonExistingWordsShouldCountedCorrectly() throws Exception {
        fail("TODO Implement me!");
        // Given a word that is not present in test fixture
        // When countLines is invoked
        // It should return 0
    }

    @After
    public void tearDown() throws Exception {
        Files.delete(testFixtureFile);
    }
}