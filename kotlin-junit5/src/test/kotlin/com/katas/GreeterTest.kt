package com.katas

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class GreeterTest {
    @Test
    fun `should say hello`() {
        val greeter = Greeter("John Doe")

        assertThat(greeter.sayHello()).isEqualTo("Hello, John Doe!")
    }
}
