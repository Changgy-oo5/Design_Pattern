package prototype;

public class Rabbit implements Prototype {

    private String name;
    private int age;
    private Person owner;

    public Rabbit(String name, int age, Person owner) {
        this.name = name;
        this.age = age;
        this.owner = owner;
    }

    @Override
    public Rabbit clone() {

        // deep copy owner
        Person newOwner = owner.clone();

        return new Rabbit(name, age, newOwner);
    }

    @Override
    public String toString() {
        return "Rabbit{name='" + name + "', age=" + age + ", owner=" + owner + "}";
    }
}