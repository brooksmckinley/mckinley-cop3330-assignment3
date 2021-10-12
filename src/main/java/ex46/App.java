package ex46;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class App {
    public static void main(String[] args) {
        try {
            String inputText = Files.readString(Path.of(ExerciseConstants.INPUT_FILENAME));
            WordCounter counter = new WordCounter();
            counter.countWords(inputText);
            System.out.print(counter.getWordsReport());
        } catch (IOException ioException) {
            System.err.println("Error reading file! Please try creating " + ExerciseConstants.INPUT_FILENAME);
        }
    }
}
