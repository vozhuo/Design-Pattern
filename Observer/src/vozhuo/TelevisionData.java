package vozhuo;

import java.util.ArrayList;

/**
 * Created by qyz on 2016/3/18.
 */
//电视节目主题
public class TelevisionData implements Subject {
    private ArrayList<Observer> observers;
    private String time; //开始时间
    private double last; //持续时间
    private String content; //内容

    public TelevisionData() {
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

    public void setMeasurements(String time, double last, String content) { //设置节目数据
        this.time = time;
        this.last = last;
        this.content = content;
        measurementsChanged(); //参数改变
    }
    public double getLast() {
        return last;
    }
    public String getTime() {
        return time;
    }
    public String getContent() {
        return content;
    }
}