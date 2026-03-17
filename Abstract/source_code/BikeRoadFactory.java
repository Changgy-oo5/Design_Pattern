package abstractfactory.bike;

public class BikeRoadFactory extends BikeAbstractFactory {

    public Frame createFrame() {
        return new RoadFrame();
    }

    public Wheel createWheel() {
        return new RoadWheel();
    }
}