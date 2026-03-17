package abstractfactory.bike;

public class BikeElectricFactory extends BikeAbstractFactory {

    public Frame createFrame() {
        return new ElectricFrame();
    }

    public Wheel createWheel() {
        return new ElectricWheel();
    }
}