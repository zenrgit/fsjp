//Create a Java program to demonstrate the use of an interface for custom weather information retrieval.

interface WeatherInfo{
    void getWeatherifo(String location);
}

class Weather implements WeatherInfo{
    public void getWeatherifo(String location){
        System.out.println("Weather information for " + location + ":");
        System.out.println("Temperature: 25°C");
        System.out.println("Humidity: 60%");
        System.out.println("Wind Speed: 10 km/h");
    }
}

public class Main {
    public static void main(String[] args) {
        Weather w = new Weather();
        w.getWeatherifo("New York");
    }
}