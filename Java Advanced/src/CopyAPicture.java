import java.io.*;

public class CopyAPicture {
    public static void main(String[] args) throws IOException{
        InputStream is = null;
        OutputStream os = null;
        try {

            is = new FileInputStream("C:\\Coding\\Java-Studies\\JavaAdvanced\\resources\\04-Java-Advanced-Files-and-Streams-Exercise-Resources\\cat.jpg");
            os = new FileOutputStream("C:\\Coding\\Java-Studies\\JavaAdvanced\\resources\\04-Java-Advanced-Files-and-Streams-Exercise-Resources\\cat-copy.jpg");

            byte[] buffer = new byte[8192];
            int length;

            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }
        } finally {
            is.close();
            os.close();
        }
    }
}
