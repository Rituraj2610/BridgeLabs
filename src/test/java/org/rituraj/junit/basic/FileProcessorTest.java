package org.rituraj.junit.basic;

import org.junit.jupiter.api.*;
import java.io.File;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.*;

class FileProcessorTest {

    private FileProcessor fileProcessor;
    private static final String TEST_FILE = "testfile.txt";

    @BeforeEach
    void setUp() {
        fileProcessor = new FileProcessor();
    }

    @Test
    @DisplayName("Test writing and reading from a file")
    void testWriteAndReadFile() throws IOException {
        String content = "Hello, JUnit!";
        fileProcessor.writeToFile(TEST_FILE, content);

        String readContent = fileProcessor.readFromFile(TEST_FILE);
        assertEquals(content, readContent, "File content should match.");
    }

    @Test
    @DisplayName("Test file exists after writing")
    void testFileExistsAfterWriting() throws IOException {
        fileProcessor.writeToFile(TEST_FILE, "Sample Content");
        File file = new File(TEST_FILE);
        assertTrue(file.exists(), "File should exist after writing.");
    }

    @Test
    @DisplayName("Test reading a non-existent file throws IOException")
    void testReadNonExistentFile() {
        assertThrows(IOException.class, () -> fileProcessor.readFromFile("nonexistent.txt"));
    }

    @AfterEach
    void tearDown() {
        File file = new File(TEST_FILE);
        if (file.exists()) {
            file.delete(); // Clean up test file
        }
    }
}

