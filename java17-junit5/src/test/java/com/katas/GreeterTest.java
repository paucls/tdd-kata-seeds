package com.katas;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class GreeterTest {

    @Test
    public void should_greet_helloworld() {
        Greeter greeter = new Greeter();

        String greeting = greeter.greet();

        assertThat(greeting).isEqualTo("Hello World!");
    }
}
