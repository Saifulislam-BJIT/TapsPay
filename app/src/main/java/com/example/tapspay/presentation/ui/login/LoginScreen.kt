package com.example.tapspay.presentation.ui.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.tapspay.R
import com.example.tapspay.presentation.ui.components.BrandIcon
import com.example.tapspay.presentation.ui.components.DividerWithText
import com.example.tapspay.presentation.ui.components.PrimaryButton
import com.example.tapspay.ui.theme.Magnolia
import com.example.tapspay.ui.theme.White
import com.example.tapspay.ui.theme.soraFontFamily
import com.example.tapspay.utils.pxToDpHeight
import com.example.tapspay.utils.pxToDpWidth

@Composable
fun LoginScreen(
    navController: NavController,
) {
    val context = LocalContext.current
    Column( modifier = Modifier
        .fillMaxSize()
        .background(Magnolia)
        .padding(8.dp), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center
    ) {
        // Top
        Image(
            painter = painterResource(id = R.drawable.taps_pay_blue_logo),
            contentDescription = stringResource(id = R.string.taps_pay),
            modifier = Modifier
                .padding(25f.pxToDpHeight(context))
                .width(88f.pxToDpWidth(context))
                .height(24f.pxToDpHeight(context)),
            alignment = Alignment.Center
        )
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(Magnolia)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center
            ) {

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
                .padding(8.dp)
                .fillMaxWidth()
                .weight(1f)
                .background(White)
        ) {
            Column {
                Text(
                    text = stringResource(id = R.string.enter_your_mobile_number),
                    fontFamily = soraFontFamily,
                    fontWeight = FontWeight.Bold
                )
                OutlinedTextField(
                    value = "",
                    onValueChange = {},
                    placeholder = { Text(text = "7x-xxx-xxx")},
                    label = { Text(text = stringResource(id = R.string.mobile_number)) },
                    modifier = Modifier.fillMaxWidth()
                )
                Spacer(modifier = Modifier.height(48f.pxToDpHeight(context)))

                Column (
                    modifier = Modifier.fillMaxHeight(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.SpaceBetween
                ){
                    PrimaryButton(text = "Continue")
                    DividerWithText(text = "or continue using")
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceEvenly
                    ) {
                        BrandIcon(painter = R.drawable.facebook_icon)
                        BrandIcon(painter = R.drawable.facebook_icon)
                        BrandIcon(painter = R.drawable.facebook_icon)
                    }
                }
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun LoginScreenPreview() {
    LoginScreen(navController = rememberNavController())
}