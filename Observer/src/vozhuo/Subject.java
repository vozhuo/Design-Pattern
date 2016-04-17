package vozhuo;

/**
 * Created by qyz on 2016/3/18.
 */
//主题接口
public interface Subject {
    void registerObserver (Observer o);  //注册
    void removeObserver (Observer o); //移除
    void notifyObservers (); //通知
}
