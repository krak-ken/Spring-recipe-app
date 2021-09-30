package com.recipe.recipe_app.services;

import com.recipe.recipe_app.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();
    Recipe findById(Long l);
}
