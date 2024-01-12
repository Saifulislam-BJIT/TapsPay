package com.example.tapspay.presentation.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.tapspay.R
import com.example.tapspay.utils.pxToDpHeight
import com.example.tapspay.utils.pxToDpWidth

@Composable
fun BrandIcon(
    painter: Int
) {
    val context = LocalContext.current
    Box(
        modifier = Modifier
            .height(45f.pxToDpHeight(context))
            .width(98f.pxToDpWidth(context)), contentAlignment = Alignment.Center
    ) {
        Card {
            Image(
                painter = painterResource(id = painter),
                contentDescription = "",
                modifier = Modifier
                    .height(24f.pxToDpHeight(context))
                    .width(24f.pxToDpWidth(context))
            )
        }
    }
}

@Preview
@Composable
fun BandIconPreview() {
    BrandIcon(painter = R.drawable.apple_icon)
}