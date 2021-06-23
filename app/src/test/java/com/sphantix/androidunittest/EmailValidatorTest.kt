package com.sphantix.androidunittest

import junit.framework.TestCase

class EmailValidatorTest : TestCase() {

    fun testIsValid() {
        assertEquals(EmailValidator.isValidEmail("name@email.com"), true)
    }
}