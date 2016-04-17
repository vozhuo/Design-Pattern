package Observer;

import java.util.ArrayList;

/**
 * Created by qyz on 2016/3/25.
 */
//飞机数据主题
public class PlaneData implements Subject {
    private ArrayList<Observer> observers;
    private int HP;
    private int ATK;

    public PlaneData() {
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
            observer.update(HP, ATK); //更新数据
        }
    }
    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(int HP, int ATK) {
        this.HP = HP;
        this.ATK = ATK;
        measurementsChanged();
    }

    public int getATK() {
        return ATK;
    }

    public int getHP() {
        return HP;
    }
}