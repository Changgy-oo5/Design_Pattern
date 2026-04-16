package adapterdesignpattern;

public class USATemperatureService {

    // trả về Fahrenheit
    public double getTemperature(String city) {
        if (city.equalsIgnoreCase("New York")) return 86; // 30°C
        if (city.equalsIgnoreCase("London")) return 68;  // 20°C
        return 77; // 25°C
    }
}
