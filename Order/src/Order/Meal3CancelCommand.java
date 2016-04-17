package Order;

/**
 * Created by sdust on 2016/3/30.
 */
public class Meal3CancelCommand implements Command {
    Meal3 meal3;

    public Meal3CancelCommand(Meal3 meal3) {
        this.meal3 = meal3;
    }

    public void execute() {
        meal3.cancel();
    }

    public void undo() {
        meal3.subscribe();
    }
}
