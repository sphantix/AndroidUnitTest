package com.sphantix.androidunittest

class Calculator(mathUtils: IMathUtils) {
    var mMathUtils: IMathUtils = mathUtils

    fun add(a: Int, b: Int): Int {
        return a + b
    }

    fun abs(num: Int) : Int {
        return mMathUtils.abs(num)
    }
}