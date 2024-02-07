package com.example.tapspay.presentation.ui.components

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.DatePicker
import androidx.compose.material3.DatePickerDialog
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.rememberDatePickerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import java.text.SimpleDateFormat
import java.util.Date

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TapsPayDatePicker(
    showDialog: Boolean
) {
    val dateState = rememberDatePickerState()
    var dialog by remember{ mutableStateOf(showDialog) }
    val formatter = SimpleDateFormat("dd/MM/yyyy")
    Log.d("TAG", "Dialog Status: ${dateState.selectedDateMillis}")
    Log.d("TAG", "Dialog Status: ${dateState.selectedDateMillis?.let { Date(it) }
        ?.let { formatter.format(it) }}")
    if (dialog){
        DatePickerDialog(
            onDismissRequest = { dialog = false },
            confirmButton = {
                Button(onClick = { dialog = false  }) {
                    Text(text = "Confirm")
                }
            }
        ) {
            DatePicker(state = dateState)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun TapsPayDatePickerPreview() {
    Column(
        modifier = Modifier.padding(8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        TapsPayDatePicker(false)
        TapsPayDatePicker(false)
        TapsPayDatePicker(false)
    }
}