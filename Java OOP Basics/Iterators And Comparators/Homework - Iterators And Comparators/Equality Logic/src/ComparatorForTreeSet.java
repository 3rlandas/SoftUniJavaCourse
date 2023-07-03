import java.util.Comparator;

public class ComparatorForTreeSet implements Comparator<Person> {
    @Override
    public int compare(Person first, Person second) {
        return Integer.compare(first.hashCode(), second.hashCode());
    }
}
