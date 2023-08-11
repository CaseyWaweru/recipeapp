package com.example.recipeapp.home

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController

@Composable
fun HomePageScreen(
    modifier: Modifier = Modifier,
    navController: NavController
){
    Column {
        Text(
            text = "This is the welcome page"
        )
    }
}