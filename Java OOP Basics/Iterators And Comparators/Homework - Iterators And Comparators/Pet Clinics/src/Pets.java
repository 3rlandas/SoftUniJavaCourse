import java.util.Map;

public class Pets {
    private String name;
    private int age;
    private String type;


    Pets(String name, int age, String type){
        this.name = name;
        this.age = age;
        this.type = type;
    }

    public Pets(Map<String,Pets> petsList) {
        Cl
    }

    @Override
    public String toString() {
        return String.format("%s, %d, %s", name, age, type);
    }
}
