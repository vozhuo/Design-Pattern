package Order;

/**
 * Created by sdust on 2016/3/30.
 */
public class Meal3SubscribeCommand implements Command {
    Meal3 meal3;

    public Meal3SubscribeCommand(Meal3 meal3) {
        this.meal3 = meal3;
    }

    public void execute() {
        meal3.subscribe();
    }

    public void undo() {
        meal3.cancel();
    }
}
