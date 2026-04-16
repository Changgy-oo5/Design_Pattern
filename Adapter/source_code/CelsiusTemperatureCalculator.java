package adapterdesignpattern;

public class CelsiusTemperatureCalculator implements TemperatureCalculator {

    @Override
    public double calculateTemperature(String city) {
        // dữ liệu giả lập
        if (city.equalsIgnoreCase("Hanoi")) return 30;
        if (city.equalsIgnoreCase("London")) return 20;
        return 25;
    }
}