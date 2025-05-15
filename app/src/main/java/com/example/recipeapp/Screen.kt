package com.example.recipeapp

sealed class Screen (val route: String){
    object RecipeScreen:Screen("recipeScreen")
    object DetailScreen:Screen("detailScreen")
}