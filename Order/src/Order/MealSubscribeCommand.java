package Order;

/**
 * Created by sdust on 2016/3/30.
 */
//订购Meal
public class MealSubscribeCommand implements Command {
    Meal meal;

    public MealSubscribeCommand(Meal meal) {
        this.meal = meal;
    }

    public void execute() {
        meal.subscribe();
    }

    public void undo() {
        meal.cancel();
    }
}
