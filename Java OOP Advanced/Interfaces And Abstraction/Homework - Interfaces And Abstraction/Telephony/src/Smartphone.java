import java.util.List;

public class Smartphone implements Callable, Browsable {
    private List<String> numbers;
    private List<String> urls;

    public Smartphone(List<String> numbers, List<String> urls) {
        this.numbers = numbers;
        this.urls = urls;
    }

    @Override
    public String browse() {
        StringBuilder output = new StringBuilder();
        this.urls.forEach(url -> {
            if (url.matches("[^\\d\\s]+")) {
                output.append("Browsing: ").append(url).append("!").append(System.lineSeparator());
            } else {
                output.append("Invalid URL!").append(System.lineSeparator());
            }
        });
        return output.toString().trim();
    }

    @Override
    public String call() {
        StringBuilder output = new StringBuilder();
        this.numbers.forEach(number -> {
            if (number.matches("^[0-9]+$")) {
                output.append("Calling... ").append(number).append(System.lineSeparator());
            } else {
                output.append("Invalid number!").append(System.lineSeparator());
            }
        });
        return output.toString().trim();
    }
}
