package vozhuo;

/**
 * Created by qyz on 2016/3/18.
 */
//观察者，监视TelevisionData与TravelData，实现Observer、DisplayElement接口
public class Audience implements Observer, DisplayElement {
    private String content;
    private double price;
    private Subject televisionData;
    private Subject travelData;

    public Audience(Subject televisionData, Subject travelData) {
        this.televisionData = televisionData;
        this.travelData = travelData;
        televisionData.registerObserver(this);
        travelData.registerObserver(this);
    }

    public void update(Subject subject) {
        if (subject instanceof TelevisionData) { //判断是否为TelevisionData类
            TelevisionData televisionData = (TelevisionData) subject;
            this.content = televisionData.getContent();
            display(subject);
        } else if (subject instanceof TravelData) { //判断是否为TravelData类
            TravelData travelData = (TravelData) subject;
            this.price = travelData.getPrice();
            if (this.price <= 300) { //如果price的值小于300，则调用display()
                display(subject);
            }
        }
    }

    public void display(Subject subject) {
        if (subject instanceof TelevisionData) {
            System.out.println("The television program " + content + " has been updated."); //显示更新信息
        } else if (subject instanceof TravelData) {
            System.out.println("This audience decide to go on a trip."); //显示观众信息
        }
    }
}