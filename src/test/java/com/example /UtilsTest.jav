package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class UtilsTest {
    @Test
    public void testAdd() {
        assertEquals(5, Utils.add(2, 3));
    }
}
