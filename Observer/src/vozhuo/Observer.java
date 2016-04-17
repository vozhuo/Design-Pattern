package vozhuo;

/**
 * Created by qyz on 2016/3/18.
 */
//观察者接口
public interface Observer {
    void update(Subject subject); //更新，传入主题参数
}
