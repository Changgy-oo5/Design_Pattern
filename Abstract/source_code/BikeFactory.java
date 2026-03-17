package abstractfactory.bike;

public class BikeFactory {

    private BikeFactory() {}

    public static BikeAbstractFactory getBike(BikeType type) {
        switch (type) {
            case MOUNTAIN:
                return new BikeMountainFactory();
            case ROAD:
                return new BikeRoadFactory();
            case ELECTRIC:
                return new BikeElectricFactory(); // 3c
            default:
                throw new IllegalArgumentException("Invalid type");
        }
    }
}
