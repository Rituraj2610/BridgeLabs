package org.rituraj.generics.personalized_meal_plan_generator;

import java.util.ArrayList;
import java.util.List;

public class VeganMeal implements MealPlan{
    private List<String> meals;

    public VeganMeal(List<String> meals) {
        this.meals = meals;
    }

    @Override
    public String getMealType() {
        return "Vegan";
    }

    @Override
    public List<String> getMeals() {
        return meals;
    }
}
