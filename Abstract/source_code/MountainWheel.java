package abstractfactory.bike;

public class MountainWheel implements Wheel {
    public void create() {
        System.out.println("Mountain Wheel created");
    }
}
