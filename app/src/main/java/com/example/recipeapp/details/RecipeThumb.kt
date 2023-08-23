package com.example.recipeapp.details

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.recipe_app.ui.theme.GrayColor
import com.example.recipeapp.models.Recipe

fun LazyListScope.RecipeThumb(
    recipe : Recipe,
    modifier: Modifier
){
    item {
        Box(
            modifier = modifier
                .background(
                    GrayColor,
                    RoundedCornerShape(20.dp)
                )
        ){
            Image(
                painter = painterResource(id = recipe.imageId),
                contentDescription = null,
                modifier = Modifier
                    .align(Alignment.Center)
                    .offset(y = (-20).dp)
            )
        }
    }
}
