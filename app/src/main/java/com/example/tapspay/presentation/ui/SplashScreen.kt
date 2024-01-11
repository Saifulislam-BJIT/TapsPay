package com.example.tapspay.presentation.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.tapspay.R
import com.example.tapspay.ui.theme.OceanBlue
import com.example.tapspay.utils.pxToDpHeight
import com.example.tapspay.utils.pxToDpWidth
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(
    navController: NavController,
    sharedModel: SharedViewModel = hiltViewModel(),
) {
    val sharedState by sharedModel.state.collectAsState()
    val context = LocalContext.current

    LaunchedEffect(key1 = "login_effect") {
        delay(3000)
        navController.popBackStack()
        navController.navigate(sharedState.route)
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(OceanBlue),
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.taps_pay_white_logo),
            contentDescription = stringResource(id = R.string.taps_pay),
            modifier = Modifier
                .width(176f.pxToDpWidth(context))
                .height(48f.pxToDpHeight(context))
        )
    }
}

@Preview(showSystemUi = true)
@Composable
fun SplashScreenPreview() {
    SplashScreen(rememberNavController())
}