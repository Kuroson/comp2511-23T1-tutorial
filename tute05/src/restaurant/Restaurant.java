package restaurant;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.json.JSONArray;
import org.json.JSONObject;

import restaurant.chargingStrategy.ChargingStrategy;
import restaurant.chargingStrategy.DiscountStrategy;
import restaurant.chargingStrategy.StandardStrategy;

public class Restaurant {
    private ChargingStrategy strategy = new StandardStrategy();
    private String name;
    private List<Meal> menu = new ArrayList<Meal>();
    private List<String> members = new ArrayList<String>();

    public Restaurant(String name) {
        this.name = name;
        JSONArray menuJSON = JSONHelper.readInData("src/restaurant/prices.json");

        for (Object Meal : menuJSON) {
            JSONObject jsonMeal = (JSONObject) Meal;
            menu.add(new Meal(jsonMeal.getString("meal"), jsonMeal.getInt("cost")));
        }
    }

    public void changeStrategy(ChargingStrategy strategy) {
        this.strategy = strategy;
    }

    public double cost(List<Meal> order, String payee) {
        return this.strategy.cost(order, this.members.contains(payee));
    }

    public void displayMenu() {
        double modifier = this.strategy.standardChargeModifier();

        for (Meal meal : menu) {
            System.out.println(meal.getName() + " - " + meal.getCost() * modifier);
        }
    }

    public static void main(String[] args) {
        Restaurant r = new Restaurant("XS"); // standard by default
        r.displayMenu();
        r.changeStrategy(new DiscountStrategy());
        r.displayMenu();
    }

}