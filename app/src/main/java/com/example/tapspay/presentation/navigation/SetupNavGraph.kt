package com.example.tapspay.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.tapspay.presentation.ui.SplashScreen
import com.example.tapspay.presentation.ui.login.LoginScreen

@Composable
fun SetupNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Screen.SplashScreen.route
    ) {
        composable(route = Screen.SplashScreen.route) { SplashScreen(navController) }
        composable(route = Screen.LoginScreen.route) { LoginScreen(navController) }
    }
}