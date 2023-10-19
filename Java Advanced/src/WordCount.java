import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class WordCount {
    public static void main(String[] args) {

        String path = "C:\\Coding\\Java-Studies\\JavaAdvanced\\resources\\04-Java-Advanced-Files-and-Streams-Exercise-Resources\\text.txt";
        String providedWordsPath = "C:\\Coding\\Java-Studies\\JavaAdvanced\\resources\\04-Java-Advanced-Files-and-Streams-Exercise-Resources\\words.txt";
        String outputPath = "C:\\Coding\\Java-Studies\\JavaAdvanced\\resources\\04-Java-Advanced-Files-and-Streams-Exercise-Resources\\WordCountOutput";

        Map<String, Integer> providedWords = new LinkedHashMap<>();

        try {
            PrintWriter printWriter = new PrintWriter(new FileWriter(outputPath));

            List<String> lines = Files.readAllLines(Path.of(providedWordsPath));

            for (String line : lines) {
                String[] arrayList = line.split("\\s+");

                for (String s : arrayList) {

                    providedWords.putIfAbsent(s, 0);
                }
            }

            List<String> linesFromPath = Files.readAllLines(Path.of(path));

            for (String line : linesFromPath) {

                String[] arrayList = line.split("\\s+");
                for (String s : arrayList) {

                    if (providedWords.containsKey(s)) {

                        providedWords.put(s, providedWords.get(s) + 1);
                    }
                }
            }
            for (Map.Entry<String, Integer> entry : providedWords.entrySet()) {

                printWriter.printf("%s - %d%n", entry.getKey(), entry.getValue());

            }
            printWriter.close();

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
