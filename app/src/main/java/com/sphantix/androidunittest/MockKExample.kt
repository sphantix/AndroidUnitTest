package com.sphantix.androidunittest

import java.util.*

object MockKExample {
    fun generateNewUUID(): String {
         return UUID.randomUUID().toString()
    }

    internal fun isExist(): Boolean {
        return false
    }
}