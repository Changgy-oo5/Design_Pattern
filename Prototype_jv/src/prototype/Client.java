package prototype;

public class Client {

    public static void main(String[] args) {

        Person owner = new Person("Trang");

        Rabbit rabbit1 = new Rabbit("Bunny", 2, owner);

        //Clone
        Rabbit rabbit2 = rabbit1.clone();

        System.out.println("Original: " + rabbit1);
        System.out.println("Clone: " + rabbit2);
    }
}
