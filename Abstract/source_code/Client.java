package abstractfactory.bike;

public class Client {
    public static void main(String[] args) {

        BikeBuilder builder = new BikeBuilder();

        builder.buildBike(BikeType.MOUNTAIN);
        System.out.println();

        builder.buildBike(BikeType.ROAD);
        System.out.println();

        builder.buildBike(BikeType.ELECTRIC); // 3c
    }
}