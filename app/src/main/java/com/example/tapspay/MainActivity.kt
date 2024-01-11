package com.example.tapspay

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import com.example.tapspay.presentation.navigation.SetupNavGraph
import com.example.tapspay.presentation.ui.SplashScreen
import com.example.tapspay.ui.theme.TapsPayTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TapsPayTheme {
                SetupNavGraph(navController = rememberNavController())
            }
        }
    }
}