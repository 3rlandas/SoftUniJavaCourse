import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class CustonObject {

    public static void main(String[] args) {

        Course courseOne = new Course("Programming ith Python", 32);

        try {
            FileOutputStream fileOut = new FileOutputStream("course.ser");
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(courseOne);
            objectOut.close();

            System.out.println("The object was succesfully written to a file! ☑️");

        } catch (Exception e) {
            System.out.println("An error occurred. 😵");
            e.printStackTrace();
        }

        Course courseDsl;

        try {
            FileInputStream fileIn = new FileInputStream("course.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);

            courseDsl = (Course) in.readObject();

            in.close();
            fileIn.close();

            System.out.println(courseDsl.toString());

        } catch (Exception e) {
            System.out.println("An exception occurred. 😾");
            e.printStackTrace();
        }
    }
}
