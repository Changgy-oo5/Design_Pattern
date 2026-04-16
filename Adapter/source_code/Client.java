package adapterdesignpattern;

public class Client {

    public static void main(String[] args) {

        // dùng Celsius trực tiếp
        TemperatureCalculator celsius = new CelsiusTemperatureCalculator();
        System.out.println("Hanoi: " + celsius.calculateTemperature("Hanoi") + " °C");

        // dùng Fahrenheit qua Adapter
        TemperatureCalculator adapter =
                new FahrenheitAdapter(new USATemperatureService());

        System.out.println("New York: " + adapter.calculateTemperature("New York") + " °C");
        System.out.println("London: " + adapter.calculateTemperature("London") + " °C");
    }
}