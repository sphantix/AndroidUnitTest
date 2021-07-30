package com.sphantix.androidunittest

import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.SmallTest
import org.hamcrest.CoreMatchers
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@SmallTest
class Calculator2Test {
    private var mCalculator: Calculator2? = null

    @Before
    fun setUp() {
        mCalculator = Calculator2()
    }

    @Test
    fun addTwoNumbers() {
        val resultAdd = mCalculator!!.add(1.0, 1.0).toDouble()
        assertThat(resultAdd, CoreMatchers.`is`(CoreMatchers.equalTo(2.0)))
    }

    @Test
    fun subTwoNumbers() {
        val resultSub: Double = mCalculator!!.sub(1.0, 1.0)!!.toDouble()
        assertThat(resultSub, CoreMatchers.`is`(CoreMatchers.equalTo(0.0)))
    }

    @Test
    fun subWorksWithNegativeResult() {
        val resultSub: Double = mCalculator!!.sub(1.0, 17.0)
        assertThat(resultSub, CoreMatchers.`is`(CoreMatchers.equalTo(-16.0)))
    }

    @Test
    fun divTwoNumbers() {
        val resultDiv: Double = mCalculator!!.div(32.0, 2.0)
        assertThat(resultDiv, CoreMatchers.`is`(CoreMatchers.equalTo(16.0)))
    }

    @Test(expected = IllegalArgumentException::class)
    fun divDivideByZeroThrows() {
        mCalculator!!.div(32.0, 0.0)
    }

    @Test
    fun mulTwoNumbers() {
        val resultMul: Double = mCalculator!!.mul(32.0, 2.0)
        assertThat(resultMul, CoreMatchers.`is`(CoreMatchers.equalTo(64.0)))
    }
}