package adapterdesignpattern;

public class FahrenheitAdapter implements TemperatureCalculator {

    private USATemperatureService service;

    public FahrenheitAdapter(USATemperatureService service) {
        this.service = service;
    }

    @Override
    public double calculateTemperature(String city) {
        double tempF = service.getTemperature(city);

        // chuyển F → C
        return (tempF - 32) * 5 / 9;
    }
}