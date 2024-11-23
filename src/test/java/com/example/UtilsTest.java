package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class UtilsTest {
    @Test
    public void testAdd() {
        Utils utils = new Utils();
        assertEquals(5, utils.add(2, 3));
    }
}
