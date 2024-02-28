package com.digi.jc_500_feb_calculator

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.digi.jc_500_feb_calculator.ui.theme.JC_500_Feb_calculatorTheme

@Composable
fun CalculatorScreen(
    uiState: UiState = UiState(),
    onEvent: (CalculatorEvent) -> Unit = {},
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(32.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Spacer(modifier = Modifier.height(100.dp))
        TextField(
            value = "", onValueChange = {}, label = { Text(text = "Number 1") },
            modifier = Modifier.fillMaxWidth()
        )
        TextField(
            value = "", onValueChange = {}, label = { Text(text = "Number 2") },
            modifier = Modifier.fillMaxWidth()
        )
        Row(
            horizontalArrangement = Arrangement.spacedBy(16.dp), modifier = Modifier.fillMaxWidth()
        ) {
            ElevatedButton(onClick = {}, modifier = Modifier.weight(1f)) { Text(text = "+") }
            ElevatedButton(onClick = {}, modifier = Modifier.weight(1f)) { Text(text = "-") }
            ElevatedButton(onClick = {}, modifier = Modifier.weight(1f)) { Text(text = "*") }
            ElevatedButton(onClick = {}, modifier = Modifier.weight(1f)) { Text(text = "/") }
        }
        ElevatedButton(
            onClick = {},
            modifier = Modifier.fillMaxWidth(),
            colors = ButtonDefaults.elevatedButtonColors(
                containerColor = MaterialTheme.colorScheme.tertiary,
                contentColor = MaterialTheme.colorScheme.onTertiary
            )
        ) {
            Text(text = "Clear")
        }
        Text(text = "Result", style = MaterialTheme.typography.displayLarge)
    }
}

@Preview(showBackground = true)
@Composable
fun CalculatorScreenPreview() {
    JC_500_Feb_calculatorTheme {
        CalculatorScreen()
    }
}