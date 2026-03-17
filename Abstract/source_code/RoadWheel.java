package abstractfactory.bike;

public class RoadWheel implements Wheel {
    public void create() {
        System.out.println("Road Wheel created");
    }
}
