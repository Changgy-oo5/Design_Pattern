package abstractfactory.bike;

public class ElectricFrame implements Frame {
    public void create() {
        System.out.println("Electric Frame created");
    }
}
