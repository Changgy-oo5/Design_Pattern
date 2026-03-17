package abstractfactory.bike;

public class BikeBuilder {

    public void buildBike(BikeType type) {

        BikeAbstractFactory factory = BikeFactory.getBike(type);

        Frame frame = factory.createFrame();
        Wheel wheel = factory.createWheel();

        System.out.println("Building " + type + " bike:");
        frame.create();
        wheel.create();
    }
}