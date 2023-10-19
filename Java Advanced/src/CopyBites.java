import java.io.*;

public class CopyBites {
    public static void main(String[] args) {

        String inputPath = "C:\\Coding\\Java-Studies\\JavaAdvanced\\resources\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\Files-and-Streams\\input.txt";
        String outputPath = "C:\\Coding\\Java-Studies\\JavaAdvanced\\resources\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\03.CopyBytesOutput.txt";

        try (FileInputStream fileInputStream = new FileInputStream(inputPath);
             OutputStream outputStream = new FileOutputStream(outputPath)) {

            int oneByte = 0;

            while ((oneByte = fileInputStream.read()) >= 0) {

                if (oneByte == 10 || oneByte == 32) {
                    outputStream.write(oneByte);

                } else {
                    String digit = String.valueOf(oneByte);
                    for (int i = 0; i < digit.length(); i++) {
                        outputStream.write(digit.charAt(i));
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
