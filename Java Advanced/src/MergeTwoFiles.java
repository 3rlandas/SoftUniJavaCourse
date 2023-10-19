import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class MergeTwoFiles {
    public static void main(String[] args) {

        String firstPath = "C:\\Coding\\Java-Studies\\JavaAdvanced\\resources\\04-Java-Advanced-Files-and-Streams-Exercise-Resources\\inputOne.txt";
        String secondPath = "C:\\Coding\\Java-Studies\\JavaAdvanced\\resources\\04-Java-Advanced-Files-and-Streams-Exercise-Resources\\inputTwo.txt";
        String outputPath = "C:\\Coding\\Java-Studies\\JavaAdvanced\\resources\\04-Java-Advanced-Files-and-Streams-Exercise-Resources\\MergeTwoFilesOutput";

        try {
            List<String> firstPathLines = Files.readAllLines(Path.of(firstPath));
            List<String> secondPathLines = Files.readAllLines(Path.of(secondPath));
            PrintWriter printWriter = new PrintWriter(new FileWriter(outputPath));

            firstPathLines.forEach(word -> printWriter.println(word));
            secondPathLines.forEach(word -> printWriter.println(word));

            printWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
