package com.example.recipeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.recipe_app.ui.theme.recipe_appTheme
import com.example.recipeapp.details.RecipeDetailScreen
import com.example.recipeapp.home.ExplorePageScreen
import com.example.recipeapp.home.HomePageScreen

@OptIn(ExperimentalMaterial3Api::class)
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            recipe_appTheme {

                val navController = rememberNavController()
                val navBackStackEntry by navController.currentBackStackEntryAsState()

                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                ) {paddingValues ->
                    NavHost(
                        navController = navController,
                        //set the start page of the app
                        startDestination = "explore_page",
                        modifier = Modifier.padding(paddingValues)
                    ){
                        composable("home_page"){
                            HomePageScreen(
                                navController = navController
                            )
                        }

                        composable("explore_page"){
                            ExplorePageScreen(
                                modifier = Modifier,
                                navController = navController
                            )
                        }

                        composable("recipe_detail_page/{recipeName}",
                            arguments = listOf(
                                navArgument("recipeName"){
                                    type = NavType.StringType
                                }
                            )

                        ){
                            val recipeName = remember{
                                it.arguments?.getString("recipeName")
                            }
                            RecipeDetailScreen(
                                recipeName ?: "",
                                navController
                            )
                        }
                    }
                }
            }
        }
    }
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ExplorePageScreen(modifier = Modifier, navController = rememberNavController() )
}