package org.firemanphil;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    @Test
    public void shouldReturnTrueForEvenNumber()
    {
        assertTrue(new App().isEven(2));
    }

    @Test
    public void shouldReturnFalseForEvenNumber()
    {
        assertFalse(new App().isEven(1));
    }
}
