package com.example.tapspay.presentation.ui.components

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Divider
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.ExposedDropdownMenuDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TapsPayDropdown(
    label: String,
    options: List<String>,
) {
    var isExpanded by remember { mutableStateOf(false) }
    var selectedOption by remember { mutableStateOf("") }

    ExposedDropdownMenuBox(
        expanded = isExpanded,
        onExpandedChange = { isExpanded = it }
    ) {
        OutlinedTextField(
            modifier = Modifier.menuAnchor(),
            label = { Text(text = label) },
            value = selectedOption,
            onValueChange = {},
            readOnly = true,
            trailingIcon = {
                ExposedDropdownMenuDefaults.TrailingIcon(expanded = isExpanded)
            }
        )

        ExposedDropdownMenu(
            expanded = isExpanded,
            onDismissRequest = { isExpanded = false }
        ) {
            options.forEachIndexed { idx, option ->
                DropdownMenuItem(
                    text = { Text(text = option) },
                    onClick = {
                        selectedOption = option
                        isExpanded = false
                    }
                )
                if (idx < options.size - 1) {
                    Divider(modifier = Modifier.padding(horizontal = 12.dp))
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun TapsPayDropdownPreview() {
    val options = listOf("Option 1", "Option 2", "Option 3")
    TapsPayDropdown("Dropdown", options)
}