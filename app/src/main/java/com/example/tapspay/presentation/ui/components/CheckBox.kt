package com.example.tapspay.presentation.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun TapsPayCheckBox(
    isCheck: Boolean = false,
    label: String
) {
    var checkedState by remember { mutableStateOf(false) }
    Row(
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Checkbox(
            checked = checkedState,
            onCheckedChange = {checkedState = it}
        )

        Text(text = label)
    }
}

@Preview(showBackground = true)
@Composable
fun TapsPayCheckBoxPreview() {
    Column(modifier = Modifier.padding(8.dp)) {
        TapsPayCheckBox(label = "Hello world")
    }
}