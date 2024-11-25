package com.example.myapplication

import junit.framework.Assert
import junit.framework.Assert.assertEquals
import junit.framework.Assert.assertTrue
import org.junit.Assume
import org.junit.Before
import org.junit.Test

class CalculationTest {

    lateinit var calculator: Calculator

    @Before
    fun before222() {
        calculator = Calculator()
    }

    @Test
    fun test_1() {
       //Assert - исключение
        // Assume - ignore
        assertEquals(3,calculator.calc(3,4))
    }

    @Test
    fun test_2() {
        assertEquals(25,calculator.calc(3,4))
    }

    @Test
    fun test_3() {
        Assume.assumeNotNull(null)
       // Assume.
    }

    @Test(expected = NullPointerException::class)
    fun test4() {
        assertTrue(calculator.getLengthStr(null))
    }

}