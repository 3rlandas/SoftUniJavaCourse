import java.util.*;

public class UserLogs {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        TreeMap<String, LinkedHashMap<String, Integer>> data = new TreeMap<>();

        while (!input[0].equals("end")){

            String ip = input[0].split("=")[1];
            String message = input[1].split("=")[1];
            String name = input[2].split("=")[1];


            data.putIfAbsent(name, new LinkedHashMap<>());
            data.get(name).putIfAbsent(ip, 0);
            data.get(name).put(ip, data.get(name).get(ip) + 1);

            input = scanner.nextLine().split(" ");
        }


        data.entrySet().forEach(e -> {
            System.out.println(e.getKey() + ": ");

            int br = 0;

            for(Map.Entry<String, Integer> m : e.getValue().entrySet()){
                System.out.printf("%s => %d", m.getKey(), m.getValue());
                if(++br < e.getValue().size()){
                    System.out.print(", ");
                }else{
                    System.out.println(".");
                }
            }
        });
    }
}
