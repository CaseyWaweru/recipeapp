package com.example.recipeapp.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.recipeapp.models.recipeList

@Composable
fun ExplorePageScreen(
    modifier: Modifier,
    navController: NavController
){
    LazyColumn(
        modifier = modifier.padding(horizontal = 25.dp),
        verticalArrangement = Arrangement.spacedBy(30.dp)
    ){
        item {
            MyRecipes(
                recipeList,
                navController
            )
        }
    }
}


