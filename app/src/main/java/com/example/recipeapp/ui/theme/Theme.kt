package com.example.recipe_app.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import com.example.recipeapp.ui.theme.typography

@Composable
fun recipe_appTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
    MaterialTheme(
        typography = typography,
        shapes = Shapes,
        content = content
    )
}
