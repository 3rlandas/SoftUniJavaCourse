public class Threeuple<K, V> {
    K item1;
    V item2;

    public Tuple(K name, V city) {

        this.item1 = name;
        this.item2 = city;
        this
    }

    @Override
    public String toString() {
        return String.format("%s -> %s -> %s", this.item1, this.item2);
    }
}
