package vozhuo;

import java.util.ArrayList;

/**
 * Created by qyz on 2016/3/18.
 */
//旅行主题
public class TravelData implements Subject {
    private ArrayList<Observer> observers;
    private String destination; //终点站
    private double price; //价格

    public TravelData() {
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
            observer.update(this);
        }
    }
    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(String destination, double price) { //设置旅行数据
        this.destination = destination;
        this.price = price;
        measurementsChanged(); //参数改变
    }
    public double getPrice() {
        return price;
    }
        public String getDestination() {
        return destination;
    }
}
