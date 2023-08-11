package com.example.recipeapp.models

import androidx.annotation.DrawableRes
import com.example.recipeapp.R

data class Recipe(
    val name: String,
    @DrawableRes val imageId: Int,
    val recipeData: RecipeData,
    val ingredients: List<String>,
    val instructions: List<String>
)

data class RecipeData(
    val recipeType: String,
    val recipeServing: Int,
    val cookingDifficulty: String
)

val recipeList = listOf(
    Recipe(
        name = "Caramel Popcorn",
        imageId = R.drawable.caramelpopcorn,
        recipeData = RecipeData("Dessert", 8, "Easy"),
        ingredients = listOf(
            "8 cups popped popcorn (about 1/4 cup kernels)",
            "6 Tablespoons butter",
            "1 1/2 cups brown sugar",
            "6 Tablespoons light karo syrup",
            "1/4 teaspoon salt",
            "1/4 tablespoon baking soda",
            "3/4 teaspoon vanilla extract"
        ),
        instructions = listOf(
            "1. Preheat the oven",
            "2. Line a jelly roll pan with parchment paper. Add popcorn to a large pan, spread out in an even layer",
            "3. Melt butter in a large non-stick skillet over a medium head. Once melted, stir in brown sugar, corn syrup, and salt until smooth",
            "4. Bring to a boil over medium heat, stirring occasionally. As soon as the caramel starts to gently boil, boil for 2 minutes, stirring consistently",
            "5. Remove from the heat and stir in baking soda and vanilla",
            "6. Immediately drizzle caramel over popcorn. Toss gently with a spatula until the popcorn is evenly coated",
            "7. Bake at 200 degrees F for 45 minutes, stirring the popcorn every 15 minutes",
        )
    )
)
/*
RECIPE DETAILS
-recipe name/title
-recipe type
-number of servings
-cooking difficulty
-list of ingredients
-preparation steps

 */

