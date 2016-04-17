package vozhuo;

import java.util.ArrayList;

/**
 * Created by qyz on 2016/3/18.
 */
//天气主题
public class WeatherData implements Subject {
    private ArrayList<Observer> observers; //观察者
    private float temperature;  //温度
    private float humidity; //湿度
    private float pressure; //压强
    private Subject subject;

    public WeatherData() {
        observers = new ArrayList();
    }
    public void registerObserver(Observer o) {
        observers.add(o);
    }
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if(i >= 0) {
            observers.remove(i);
        }
    }
    public void notifyObservers() {
        for (Observer observer: observers) {
            observer.update(this); //更新数据
        }
    }
    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity ,float pressure) { //设置天气数据
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged(); //参数改变
    }
    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}