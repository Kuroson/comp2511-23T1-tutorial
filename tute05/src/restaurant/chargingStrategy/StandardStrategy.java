package restaurant.chargingStrategy;

import java.util.List;

import restaurant.Meal;

/**
 * Standard - normal rates
 */
public class StandardStrategy implements ChargingStrategy {

    public double cost(List<Meal> order, boolean payeeIsMember) {
        return order.stream().mapToDouble(meal -> meal.getCost()).sum();
    }

    public double standardChargeModifier() {
        return 1;
    }
}
