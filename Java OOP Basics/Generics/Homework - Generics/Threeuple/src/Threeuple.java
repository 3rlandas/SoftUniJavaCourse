public class Threeuple <K, V, V1> {
    K item1;
    V item2;
    V1 item3;

    public Threeuple(K name, V city, V1 country) {

        this.item1 = name;
        this.item2 = city;
        this.item3 = country;
    }

    @Override
    public String toString() {
        return String.format("%s -> %s -> %s", this.item1, this.item2, this.item3);
    }
}
