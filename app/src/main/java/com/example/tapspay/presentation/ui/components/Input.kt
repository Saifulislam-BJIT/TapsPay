package com.example.tapspay.presentation.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Error
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.tapspay.ui.theme.AzureishWhite
import com.example.tapspay.ui.theme.GoldenGateBridge
import com.example.tapspay.ui.theme.OceanBlue
import com.example.tapspay.ui.theme.Shamrock

@Composable
fun TapsPayInput(
    value: String,
    onValueChange: (String) -> Unit,
    placeholder: String,
    isCheck: Boolean = false,
    isError: Boolean = false,
) {
    val icon = if (isError) Icons.Default.Error else Icons.Default.CheckCircle

    val borderColor = OutlinedTextFieldDefaults.colors(
        focusedBorderColor = OceanBlue,
        unfocusedBorderColor = if (isCheck) Shamrock else AzureishWhite,
        errorBorderColor = GoldenGateBridge
    )

    OutlinedTextField(
        value = value,
        onValueChange = { onValueChange(it) },
        maxLines = 1,
        placeholder = { Text(text = placeholder) },
        trailingIcon = {
            if (isCheck) Icon(
                icon,
                contentDescription = null,
                tint = if (isError) GoldenGateBridge else Shamrock
            )
        },
        isError = isError,
        colors = borderColor
    )
}

@Preview(showBackground = true)
@Composable
fun TapsPayInputPreview() {
    Column(
        modifier = Modifier.padding(8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        TapsPayInput("", {}, placeholder = "Enter your mail")
        TapsPayInput("", {}, placeholder = "Enter your mail", true)
        TapsPayInput("", {}, placeholder = "Enter your mail", true, true)
    }
}