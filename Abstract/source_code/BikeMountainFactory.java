package abstractfactory.bike;

public class BikeMountainFactory extends BikeAbstractFactory {

    public Frame createFrame() {
        return new MountainFrame();
    }

    public Wheel createWheel() {
        return new MountainWheel();
    }
}