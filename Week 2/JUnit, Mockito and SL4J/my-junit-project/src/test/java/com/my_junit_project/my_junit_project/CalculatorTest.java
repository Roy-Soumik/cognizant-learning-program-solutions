package com.my_junit_project.my_junit_project;

// import static org.junit.jupiter.api.Assertions.*;
// import org.junit.jupiter.api.Test;
// import com.my_junit_project.Calculator;

// public class CalculatorTest {
//     @Test
//     void testAddition() {
//         Calculator calc = new Calculator();
//         assertEquals(5, calc.add(2, 3));
//     }
// }

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import com.my_junit_project.Calculator;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    public void setUp() {
        System.out.println("Setting up Calculator instance...");
        calculator = new Calculator();
    }

    @AfterEach
    public void tearDown() {
        System.out.println("Tearing down Calculator instance...");
        calculator = null;
    }

    @Test
    public void testAddition() {
        int result = calculator.add(2, 3);
        assertEquals(5, result, "2 + 3 should equal 5");
    }

    @Test
    public void testSubtraction() {
        int result = calculator.subtract(5, 3);
        assertEquals(2, result, "5 - 3 should equal 2");
    }
}

