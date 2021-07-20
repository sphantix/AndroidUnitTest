package com.sphantix.androidunittest

import io.mockk.every
import io.mockk.mockkObject
import org.junit.Test

import org.junit.Assert.*

class MockKExampleTest {

    @Test
    fun generateNewUUID() {
        mockkObject(MockKExample)
        every {MockKExample.generateNewUUID()} returns "FAKE UUID"

        assertEquals("FAKE UUID", MockKExample.generateNewUUID())
    }
}