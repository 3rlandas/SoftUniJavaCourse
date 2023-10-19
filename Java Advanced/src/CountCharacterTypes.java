import java.io.*;
import java.util.Set;

public class CountCharacterTypes {
    public static void main(String[] args) {

        String inputPath = "C:\\Coding\\Java-Studies\\JavaAdvanced\\resources\\04-Java-Advanced-Files-and-Streams-Exercise-Resources\\input.txt";
        String outputPath = "C:\\Coding\\Java-Studies\\JavaAdvanced\\resources\\04-Java-Advanced-Files-and-Streams-Exercise-Resources\\CountCharacterTypesOutput";

        int vowelsCount = 0;
        int consonantsCount = 0;
        int punctuationsCount = 0;
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');
        Set<Character> punctuations = Set.of('!', '?', '.', ',');

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(inputPath));
            PrintWriter printWriter = new PrintWriter(new FileWriter(outputPath));

            String line = bufferedReader.readLine();

            while (line != null) {

                for (char c : line.toCharArray()) {

                    if(vowels.contains(c)){
                        vowelsCount++;
                    }else if (punctuations.contains(c)){
                        punctuationsCount++;
                    }else if (c != ' '){
                        consonantsCount++;
                    }
                }
                line = bufferedReader.readLine();
            }
            printWriter.printf("Vowels: %d%nConsonants: %d%nPunctuation: %d%n",vowelsCount, consonantsCount, punctuationsCount);
            printWriter.close();

        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
}
