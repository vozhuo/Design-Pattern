package vozhuo;

public class Main {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        TelevisionData televisionData = new TelevisionData();
        TravelData travelData = new TravelData();

        CurrentDisplay currentDisplay = new CurrentDisplay(weatherData);
        Guide guide = new Guide(travelData, weatherData);
        Audience audience = new Audience(televisionData, travelData);

        weatherData.setMeasurements(20, 65, 30.4f);
        travelData.setMeasurements("Qingdao", 300);
        televisionData.setMeasurements("19:30", 5, "forecast");

        System.out.println("-----------------------------");

        weatherData.setMeasurements(5, 50, 35.8f);
        travelData.setMeasurements("Qingdao", 400);
        televisionData.setMeasurements("19:30", 5, "forecast");
    }
}
