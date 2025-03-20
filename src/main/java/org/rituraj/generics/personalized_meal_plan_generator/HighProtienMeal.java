package org.rituraj.generics.personalized_meal_plan_generator;

import java.util.ArrayList;
import java.util.List;

public class HighProtienMeal implements MealPlan{

    private List<String> meals;

    public HighProtienMeal(List<String> meals) {
        this.meals = meals;
    }

    @Override
    public String getMealType() {
        return "High Protein";
    }

    @Override
    public List<String> getMeals() {
        return meals;
    }
}
