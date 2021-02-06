package com.dev.codecoverage_example.util

import org.junit.Test
import com.google.common.truth.Truth.assertThat


class TextMethodsTest {


    @Test
    fun counttext() {
        val yu = TextMethods.counttext("tuuuuu", "")
        // assertTrue("text contains two characters", yu == 2)
        //  assertNotNull("text is not null", yu)
        assertThat(yu).isGreaterThan(4)

    }

    @Test
    fun capitalizeText() {
        val yu = TextMethods.capitalizeText("tuuuuu", "")
        assertThat(yu).contains("TUUUUU")
    }

}