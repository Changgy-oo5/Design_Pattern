package abstractfactory.bike;

public class ElectricWheel implements Wheel {
    public void create() {
        System.out.println("Electric Wheel created");
    }
}
