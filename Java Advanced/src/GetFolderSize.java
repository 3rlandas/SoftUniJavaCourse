import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class GetFolderSize {
    public static void main(String[] args) {

        String fileName = "C:\\Coding\\Java-Studies\\JavaAdvanced\\resources\\04-Java-Advanced-Files-and-Streams-Exercise-Resources\\Exercises Resources";
        String outputPath = "C:\\Coding\\Java-Studies\\JavaAdvanced\\resources\\04-Java-Advanced-Files-and-Streams-Exercise-Resources\\GetFolderFileOutput";

        Path filePath = Paths.get(fileName);

        try {
            PrintWriter printWriter = new PrintWriter(new FileWriter(outputPath));
            long bytes = Files.size(filePath);
            printWriter.println(String.format("Folder size: " + bytes));
            printWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
