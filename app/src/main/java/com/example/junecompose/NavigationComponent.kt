package com.example.junecompose


import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.HomeScreen


@Composable
fun NavigationComponet(){
    val navController= rememberNavController()

    NavHost(navController = navController, startDestination = "home" ){
        composable("home"){
            MainScreen(navController = navController)
        }
        composable("details"){
            HomeScreen()
            //MainScreen(navController = navController)
        }
    }
}