package com.example.recipeapp.details

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.recipeapp.models.recipeList

@Composable
fun RecipeDetailScreen(
    recipeName: String,
    navController: NavController
){

    val recipe = remember(recipeName){
        recipeList.find {
            it.name == recipeName
        }
    }
    //Experiment with LazyVerticalGrid to make it work
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 25.dp),
            verticalArrangement = Arrangement.spacedBy(25.dp)
    ){

//        Spacer(modifier = Modifier.height(20.dp))

        //try Icon if this doesn't work
        item(){
            Image(
                imageVector = Icons.Outlined.ArrowBack,
                contentDescription = null,
                modifier = Modifier
                    .size(30.dp)
                    .clickable {
                        navController.popBackStack()
                    }
            )
        }

        RecipeThumb(
            recipe!!,
            modifier = Modifier.fillMaxWidth()
        )

        RecipeData(
            recipe,
            modifier = Modifier.fillMaxWidth()
        )

        RecipeInfo(
            recipe,
            modifier = Modifier.fillMaxWidth()
        )

    }
}



