package org.rituraj.generics.personalized_meal_plan_generator;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> vegMeals = Arrays.asList("Salad", "Paneer Curry", "Vegetable Stir Fry");
        VegetarianMeal vegetarianMeal = new VegetarianMeal(vegMeals);

        List<String> ketoMeals = Arrays.asList("Grilled Chicken", "Avocado Salad", "Egg Omelette");
        KetoMeal ketoMeal = new KetoMeal(ketoMeals);

        // Using generic Meal class
        Meal<VegetarianMeal> vegMealPlan = new Meal<>(vegetarianMeal);
        Meal<KetoMeal> ketoMealPlan = new Meal<>(ketoMeal);

        // Using generic method
        MealPlanGenerator.generateMealPlan(vegetarianMeal);
        MealPlanGenerator.generateMealPlan(ketoMeal);
    }
}
