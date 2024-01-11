package com.example.tapspay.presentation.ui.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.tapspay.R
import com.example.tapspay.ui.theme.Magnolia
import com.example.tapspay.ui.theme.White
import com.example.tapspay.utils.pxToDpHeight
import com.example.tapspay.utils.pxToDpWidth

@Composable
fun LoginScreen(
    navController: NavController,
) {
    val context = LocalContext.current
    Column {
        // Top
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .background(Magnolia)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(8.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.taps_pay_blue_logo),
                    contentDescription = stringResource(id = R.string.taps_pay),
                    modifier = Modifier
                        .width(88f.pxToDpWidth(context))
                        .height(24f.pxToDpHeight(context)),
                    alignment = Alignment.Center
                )
                Image(
                    painter = painterResource(id = R.drawable.mobile),
                    contentDescription = stringResource(id = R.string.icon),
                    modifier = Modifier
                        .width(187f.pxToDpWidth(context))
                        .height(190f.pxToDpHeight(context)),
                    alignment = Alignment.Center
                )
            }
        }

        // Bottom
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .background(White)
        ) {
            Column {
                Image(
                    painter = painterResource(id = R.drawable.taps_pay_blue_logo),
                    contentDescription = stringResource(id = R.string.taps_pay)
                )
                Image(
                    painter = painterResource(id = R.drawable.mobile),
                    contentDescription = stringResource(id = R.string.icon)
                )
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun LoginScreenPreview() {
    LoginScreen(navController = rememberNavController())
}