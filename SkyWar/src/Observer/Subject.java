package Observer;

/**
 * Created by qyz on 2016/3/25.
 */
//主题接口
public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
