import java.util.ArrayList;
import java.util.List;

public class Person {

    private String name;
    private List<Pokemon> pokemon;
    private Company company;
    private List<Parents> parents;
    private List<Children> children;
    private Car car;

    public Person(String name, Company company, List<Parents> parents, List<Children> children, Car car, List<Pokemon> pokemon) {
        this.name = name;
        this.company = company;
        this.parents = parents;
        this.children = children;
        this.car = car;
        this.pokemon = pokemon;
    }

    public Person(String name) {
        car  = null;
        this.name = name;
        company = null;
        this.parents = new ArrayList<>();
        this.children = new ArrayList<>();
        this.pokemon = new ArrayList<>();
    }
    public Person() {
        car  = null;
        name = null;
        company = null;
        this.parents = new ArrayList<>();
        this.children = new ArrayList<>();
        this.pokemon = new ArrayList<>();
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public void setChildren(List<Children> children) {
        this.children = children;
    }

    public void setParents(List<Parents> parents) {
        this.parents = parents;
    }

    public void setPokemon(List<Pokemon> pokemon) {
        this.pokemon = pokemon;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Car getCar() {
        return car;
    }

    public List<Children> getChildren() {
        return children;
    }

    public List<Parents> getParents() {
        return parents;
    }

    public List<Pokemon> getPokemon() {
        return pokemon;
    }

    public Company getCompany() {
        return company;
    }

    public String getName() {
        return name;
    }
}
