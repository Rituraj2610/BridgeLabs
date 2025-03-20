package org.rituraj.generics.personalized_meal_plan_generator;

import java.util.ArrayList;
import java.util.List;

public class KetoMeal implements MealPlan{
    private List<String> meals;

    public KetoMeal(List<String> meals) {
        this.meals = meals;
    }

    @Override
    public String getMealType() {
        return "Keto";
    }

    @Override
    public List<String> getMeals() {
        return meals;
    }
}
