package com.example.tapspay.presentation.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun DividerWithText(text: String) {
    Row (
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(16.dp)
    ){
        Divider(modifier = Modifier.weight(1f))
        Text(text = text)
        Divider(modifier = Modifier.weight(1f))
    }
}

@Preview(showSystemUi = true)
@Composable
fun DividerWithTextPreview() {
    DividerWithText(text = "Hello")
}