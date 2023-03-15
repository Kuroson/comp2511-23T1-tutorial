package restaurant.chargingStrategy;

import java.util.List;

import restaurant.Meal;

public class NewYearStrategy implements ChargingStrategy {
    /**
     * The cost of a meal.
     */
    public double cost(List<Meal> order, boolean payeeIsMember) {
        return 0;
    }

    /**
     * Modifying factor of charges for standard customers.
     */
    public double standardChargeModifier() {
        return 0;
    }
}
