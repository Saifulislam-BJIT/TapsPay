package com.example.tapspay.domain.model.state

import com.example.tapspay.presentation.navigation.Screen

data class SharedState(
    val route: String = Screen.LoginScreen.route
)
