public class Main {
    public static void main(String[] args) {
        Jar<String> stringJar = new Jar<>();
        stringJar.add("Hello");
        stringJar.add("SoftUni");
        System.out.println(stringJar.remove());
    }
}