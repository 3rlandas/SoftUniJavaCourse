import java.io.*;

public class SumBytes {
    public static void main(String[] args) {

        String inputPath = "C:\\Coding\\Java-Studies\\JavaAdvanced\\resources\\04-Java-Advanced-Files-and-Streams-Exercise-Resources\\input.txt";
        String outputPath = "C:\\Coding\\Java-Studies\\JavaAdvanced\\resources\\04-Java-Advanced-Files-and-Streams-Exercise-Resources\\SumBytesOutput";


        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(inputPath));
            PrintWriter printWriter = new PrintWriter(new FileWriter(outputPath));

            String line = bufferedReader.readLine();

            long count = 0;
            while (line != null) {

                for (char c : line.toCharArray()) {
                    count += c;
                }
                line = bufferedReader.readLine();
            }
            printWriter.println(count);
            printWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
