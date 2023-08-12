import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));

        List<Identifiable> entries = new ArrayList<>();

        String input = bfr.readLine();
        while (!"End".equals(input)){
            String[] tokens = input.split("\\s+");

            if (tokens.length == 3){
                entries.add(new Citizen(tokens[2], tokens[0], Integer.parseInt(tokens[1])));
            } else if (tokens.length == 2) {
                entries.add(new Robot(tokens[1], tokens[0]));
            }
            input = bfr.readLine();
        }
        String fakeIdLastDigits = bfr.readLine();
        entries.stream().filter(e -> e.getId().endsWith(fakeIdLastDigits)).forEach(e -> System.out.println(e.getId()));
    }
}