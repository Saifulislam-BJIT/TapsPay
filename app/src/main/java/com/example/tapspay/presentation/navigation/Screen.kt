package com.example.tapspay.presentation.navigation

sealed class Screen(val route: String) {
    data object SplashScreen: Screen("splash_screen")
    data object LoginScreen: Screen("login_screen")
}