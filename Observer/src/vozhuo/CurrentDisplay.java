package vozhuo;

/**
 * Created by qyz on 2016/3/18.
 */
//观察者，监视WeatherData，实现Observer、DisplayElement接口
public class CurrentDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    public void update(Subject subject) {
        if(subject instanceof WeatherData) { //判断是否是WeatherData类
            WeatherData weatherData = (WeatherData) subject;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display(subject);
        }
    }
    public void display(Subject subject) { //显示温度与湿度
        if(subject instanceof WeatherData) {
            System.out.println("Weather conditions: " + temperature + "C degree and " + humidity + "% humidity.");
        }
    }
}