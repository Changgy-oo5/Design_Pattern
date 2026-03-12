package prototype;

public class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Person clone() {
        return new Person(name);
    }

    @Override
    public String toString() {
        return name;
    }
}
