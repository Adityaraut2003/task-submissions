package com.example;

import app.Utils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UtilsTest {

    @Test
    public void testAddNumbers() {
        int result = Utils.addNumbers(5, 10);
        assertEquals(15, result, "5 + 10 should equal 15");
    }
}
