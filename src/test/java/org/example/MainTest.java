package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Unit test for simple App.
 */
public class MainTest {
    @Test
    public void CheckHelloWorld() {
        Main app = new Main();
        assertEquals("Hello World!", app.main());
    }

    @Test
    public void testShouldBePassed() {
        assertTrue(true);
    }
}
