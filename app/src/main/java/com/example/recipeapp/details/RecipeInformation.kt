package com.example.recipeapp.details

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.recipe_app.ui.theme.GrayColor
import com.example.recipe_app.ui.theme.LightTextColor
import com.example.recipeapp.models.Recipe

@Composable
fun RecipeInfo(
    recipe: Recipe,
    modifier: Modifier
){
    //Remember to remove the column and put everything in a lazy column
    Column(
        modifier = modifier
            .background(
                GrayColor,
                RoundedCornerShape(20.dp)
            )
            .padding(20.dp)
    ){
        Text(
            text = "Ingredients",
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(15.dp))

        LazyColumn {
            //Loop through the ingredients
            itemsIndexed(
                recipe.ingredients
            ){
                    index, string ->
                Text(
                    text = string,
                    fontWeight = FontWeight.SemiBold,
                    color = LightTextColor
                )
            }
        }

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "Instructions",
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(15.dp))

        LazyColumn {
            //Loop through the ingredients
            itemsIndexed(
                recipe.instructions
            ){
                    index, string ->
                Text(
                    text = string,
                    fontWeight = FontWeight.SemiBold,
                    color = LightTextColor
                )
            }
        }

    }
}
