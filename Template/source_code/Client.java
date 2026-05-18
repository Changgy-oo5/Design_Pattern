package pattern;

public class Client {
    public static void main(String[] args) {
        Character varrior = new Varrior();
        Character mage = new Mage();
        Character archer = new Archer();

        System.out.println("======Varrior======");
        varrior.takeTurn();
        System.out.println("=====Mage=====");
        mage.takeTurn();
        System.out.println("=====Aecher=====");
        archer.takeTurn();
    }
}