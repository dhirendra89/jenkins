package org.learning;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.platform.commons.annotation.Testable;

@Testable
public class JenkinsCalculatorTest {

    @Test
    public void addNumbersTest() {
        JenkinsCalculator calculator = new JenkinsCalculator();
        Assertions.assertEquals(300, calculator.addNumbers(100, 200));
    }

    @Test
    public void subtractNumbersTest() {
        JenkinsCalculator calculator = new JenkinsCalculator();
        Assertions.assertEquals(80, calculator.subtractNumbers(100, 20));
    }
}
