import java.io.*;

public class LineNumbers {
    public static void main(String[] args) {

        String inputPath = "C:\\Coding\\Java-Studies\\JavaAdvanced\\resources\\04-Java-Advanced-Files-and-Streams-Exercise-Resources\\inputLineNumbers.txt";
        String outputPath = "C:\\Coding\\Java-Studies\\JavaAdvanced\\resources\\04-Java-Advanced-Files-and-Streams-Exercise-Resources\\LineNumbersOutput";

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(inputPath));
            PrintWriter printWriter = new PrintWriter(new FileWriter(outputPath));

            String line = bufferedReader.readLine();

            int count = 1;
            while (line != null) {

                printWriter.printf("%d. %s%n", count, line);

                count++;
                line = bufferedReader.readLine();
            }
            printWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
