package org.rituraj.generics.personalized_meal_plan_generator;

class MealPlanGenerator {
    public static <T extends MealPlan> void generateMealPlan(T mealPlan) {
        System.out.println("Generating meal plan for: " + mealPlan.getMealType());
        System.out.println("Meals included: " + String.join(", ", mealPlan.getMeals()));
    }
}
