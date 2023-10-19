import java.io.*;

public class SerializeCustonObject {

    public static void main(String[] args){

        Cube cube = new Cube("Green", 15.3, 12.4, 3);

        String path = "C:\\Coding\\Java-Studies\\JavaAdvanced\\resources\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\serialization.txt";

        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(path))) {
            objectOutputStream.writeObject(cube);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
