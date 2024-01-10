package com.example.tapspay.presentation.ui

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import com.example.tapspay.R

@Composable
fun SplashScreen() {
    Image(
        painter = painterResource(id = R.drawable.taps_pay_logo),
        contentDescription = stringResource(id = R.string.taps_pay)
    )
}