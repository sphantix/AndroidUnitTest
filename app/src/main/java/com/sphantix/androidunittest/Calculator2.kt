package com.sphantix.androidunittest

import android.annotation.SuppressLint
import androidx.core.util.Preconditions.checkArgument

class Calculator2 {
    enum class Operator {
        ADD, SUB, DIV, MUL
    }

    /**
     * Addition operation
     */
    fun add(firstOperand: Double, secondOperand: Double): Double {
        return firstOperand + secondOperand
    }

    /**
     * Substract operation
     */
    fun sub(firstOperand: Double, secondOperand: Double): Double {
        return firstOperand - secondOperand
    }

    /**
     * Divide operation
     */
    @SuppressLint("RestrictedApi")
    fun div(firstOperand: Double, secondOperand: Double): Double {
        checkArgument(
            secondOperand != 0.0,
            "secondOperand must be != 0, you cannot divide by zero"
        )
        return firstOperand / secondOperand
    }

    /**
     * Multiply operation
     */
    fun mul(firstOperand: Double, secondOperand: Double): Double {
        return firstOperand * secondOperand
    }

}