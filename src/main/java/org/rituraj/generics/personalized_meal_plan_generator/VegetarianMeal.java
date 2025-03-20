package org.rituraj.generics.personalized_meal_plan_generator;

import java.util.ArrayList;
import java.util.List;

public class VegetarianMeal implements MealPlan{
    private List<String> meals;

    public VegetarianMeal(List<String> meals) {
        this.meals = meals;
    }

    @Override
    public String getMealType() {
        return "Vegetarian";
    }

    @Override
    public List<String> getMeals() {
        return meals;
    }

}
