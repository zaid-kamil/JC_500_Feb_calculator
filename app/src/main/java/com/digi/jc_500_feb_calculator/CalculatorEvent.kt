package com.digi.jc_500_feb_calculator

sealed class CalculatorEvent {
    data object Add : CalculatorEvent()
    data object Sub : CalculatorEvent()
    data object Div : CalculatorEvent()
    data object Mul : CalculatorEvent()
    data object Clear : CalculatorEvent()
    data class Num1(val value: String) : CalculatorEvent()
    data class Num2(val value: String) : CalculatorEvent()
}