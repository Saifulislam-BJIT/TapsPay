package com.example.tapspay.presentation.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun TapsPayRadioButton(
    modifier: Modifier = Modifier,
    text: String,
    isSelected: Boolean = false
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        RadioButton(
            selected = isSelected,
            onClick = { /*TODO*/ }
        )
        Text(text = text)
    }
}

@Preview(showBackground = true)
@Composable
fun TapsPayRadioButtonPreview() {
    Column(
        modifier = Modifier.padding(8.dp)
    ) {
        TapsPayRadioButton(
            text = "Radio Button"
        )

        TapsPayRadioButton(
            text = "Radio Button",
            isSelected = true
        )
    }
}