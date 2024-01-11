package com.example.tapspay.presentation.ui.components

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun PrimaryButton(
    text: String = ""
) {
    Button(onClick = { /*TODO*/ }) {
        Text(text = text)
    }
}

@Preview
@Composable
fun PrimaryButtonPreview() {
    PrimaryButton("Button")
}