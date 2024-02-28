package com.digi.jc_500_feb_calculator

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

data class UiState(
    val num1: String = "",
    val num2: String = "",
    val ans: String = "",
)

class CalcViewModel : ViewModel() {
    // step 1: setup ui state flow
    private val _uiState = MutableStateFlow(UiState())
    var uiState: StateFlow<UiState> = _uiState.asStateFlow()

    // step 2: handle events from user
    fun onEvent(event: CalculatorEvent) {
        when (event) {
            CalculatorEvent.Add -> add()
            CalculatorEvent.Clear -> clear()
            CalculatorEvent.Div -> division()
            CalculatorEvent.Mul -> multiplication()
            CalculatorEvent.Sub -> subtract()
            is CalculatorEvent.Num1 -> {
                _uiState.update { it.copy(num1 = event.value) }
            }
            is CalculatorEvent.Num2 -> {
                _uiState.update { it.copy(num2 = event.value) }
            }
        }
    }

    // step 3: create functions to handle events
    private fun add() {}
    private fun clear() {}
    private fun division() {}
    private fun multiplication() {}
    private fun subtract() {}
}