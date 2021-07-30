package com.sphantix.androidunittest

import androidx.test.filters.SmallTest
import org.hamcrest.CoreMatchers
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import java.util.*

/**
 * JUnit4 tests for the calculator's add logic.
 *
 *
 *  This test uses Junit4s Parameterized tests features which uses annotations to pass
 * parameters into a unit test. The way this works is that you have to use the [Parameterized]
 * runner to run your tests.
 *
 */
@RunWith(Parameterized::class)
@SmallTest
class Calculator2AddParameterizedTest
/**
 * Constructor that takes in the values specified in
 * [CalculatorAddParameterizedTest.data]. The values need to be saved to fields in order
 * to reuse them in your tests.
 */(
    private val mOperandOne: Double, private val mOperandTwo: Double,
    private val mExpectedResult: Double
) {
    companion object {
        /**
         * @return [Iterable] that contains the values that should be passed to the constructor.
         * In this example we are going to use three parameters: operand one, operand two and the
         * expected result.
         */
        @JvmStatic
        @Parameterized.Parameters
        fun data(): Iterable<Array<Any>> {
            return listOf(
                arrayOf(0, 0, 0),
                arrayOf(0, -1, -1),
                arrayOf(2, 2, 4),
                arrayOf(8, 8, 16),
                arrayOf(16, 16, 32),
                arrayOf(32, 0, 32),
                arrayOf(64, 64, 128)
            )
        }
    }

    private var mCalculator: Calculator2? = null
    @Before
    fun setUp() {
        mCalculator = Calculator2()
    }

    @Test
    fun testAdd_TwoNumbers() {
        val resultAdd =
            mCalculator!!.add(mOperandOne, mOperandTwo).toDouble()
        Assert.assertThat(resultAdd, CoreMatchers.`is`(CoreMatchers.equalTo(mExpectedResult)))
    }
}