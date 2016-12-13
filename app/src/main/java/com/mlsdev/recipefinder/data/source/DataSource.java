package com.mlsdev.recipefinder.data.source;

import com.mlsdev.recipefinder.data.entity.nutrition.NutritionAnalysisResult;
import com.mlsdev.recipefinder.data.entity.nutrition.RecipeAnalysisParams;
import com.mlsdev.recipefinder.data.entity.recipe.Recipe;
import com.mlsdev.recipefinder.data.entity.recipe.SearchResult;

import java.util.List;
import java.util.Map;

import rx.Observable;

public interface DataSource {
    Observable<SearchResult> searchRecipes(Map<String, String> params);

    Observable<NutritionAnalysisResult> getIngredientData(Map<String, String> params);

    Observable<List<Recipe>> getFavorites();

    Observable<Boolean> addToFavorites(Recipe favoriteRecipe);

    Observable<Boolean> removeFromFavorites(Recipe removedRecipe);

    Observable<Boolean> isInFavorites(Recipe recipe);

    Observable<NutritionAnalysisResult> getRecipeAnalysingResult(RecipeAnalysisParams params);

    void addAnalyzingResult(NutritionAnalysisResult analysisResult, Map<String, String> params);
}
