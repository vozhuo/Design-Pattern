package vozhuo;

/**
 * Created by qyz on 2016/3/18.
 */
//观察者，监视WeatherData与TravelData，实现Observer、DisplayElement接口
public class Guide implements Observer, DisplayElement {
    private String destination;
    private double price;
    private float temperature;
    private Subject travelData;
    private Subject weatherData;

    public Guide(Subject travelData, Subject weatherData) {
        this.travelData = travelData;
        this.weatherData = weatherData;
        travelData.registerObserver(this);
        weatherData.registerObserver(this);
    }
    public void update(Subject subject) {
        if(subject instanceof TravelData) { //判断是否为TravelData类
            TravelData travelData = (TravelData) subject;
            this.destination = travelData.getDestination();
            this.price = travelData.getPrice();
            display(subject);
        } else if(subject instanceof WeatherData) { //判断是否为WeatherData类
            WeatherData weatherData = (WeatherData) subject;
            this.temperature = weatherData.getTemperature();
            if(this.temperature < 10) { //如果temperature的值小于10，则调用display()
                display(subject);
            }
        }
    }

    public void display(Subject subject) {
        if(subject instanceof TravelData) {
            System.out.println("The destination is " + destination + ", cost " + price + " yuan."); //显示目的地与价格
        } else if (subject instanceof WeatherData) {
            System.out.println("The travel price is discounted."); //显示打折信息
        }
    }
}
