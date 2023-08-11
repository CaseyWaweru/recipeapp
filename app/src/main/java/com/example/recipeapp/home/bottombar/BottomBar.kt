package com.example.recipeapp.home.bottombar

import androidx.annotation.DrawableRes
import androidx.compose.runtime.Composable

sealed class BottomBarItem(
    val title: String,
    @DrawableRes val iconId: Int
)
@Composable
fun BottomBar(){

}