package com.example.recipeapp.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.recipeapp.models.Recipe
import com.example.recipe_app.ui.theme.GrayColor

@Composable
fun MyRecipes(
    recipeList: List<Recipe>,
    navController: NavController
){
    Column {
        Text(
            text = "Recipes",
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp,
        )

        Spacer(modifier = Modifier.height(30.dp))

        recipeList.forEach { recipe ->
            RecipeCard(
                recipe,
                Modifier.fillMaxWidth()
            ){
                navController.navigate(
                    "recipe_detail_page/$it"
                )
            }

            Spacer(modifier = Modifier.height(30.dp))
        }
    }
}

@Composable
fun RecipeCard(
    recipe: Recipe,
    modifier: Modifier,
    onClick: (String) -> Unit
){
    Row(modifier = modifier
        .background(
            GrayColor,
            RoundedCornerShape(20.dp)
        )
        .height(height = 170.dp)
        .padding(end = 20.dp)
        .clickable {
            onClick(recipe.name)
        }

    ) {
        Image(
            painter = painterResource(id = recipe.imageId),
            contentDescription = null,
            modifier = Modifier
                .offset(y = (-20).dp)
        )

        Column(
            modifier = Modifier
                .align(Alignment.CenterVertically)
                .weight(1f)
        ) {
            Text(
                text = recipe.name,
                fontWeight = FontWeight.SemiBold
            )
        }
    }
}
