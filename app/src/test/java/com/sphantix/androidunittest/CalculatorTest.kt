package com.sphantix.androidunittest

import org.junit.Assert.*
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito.`when`
import org.mockito.runners.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class CalculatorTest {
    @Mock
    private lateinit var mockMathUtils:IMathUtils

    lateinit var calculator: Calculator

    @Before
    fun onSetUp() {
        calculator = Calculator(mockMathUtils)
    }

    @Test
    fun add() {
        val a = 1
        val b = 2

        assertEquals(calculator.add(a, b), 3)
    }

    @Test
    fun abs() {
        `when`(mockMathUtils.abs(-1))
            .thenReturn(1)

        assertEquals(calculator.abs(-1), 1)
    }
}