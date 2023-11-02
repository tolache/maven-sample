package com.tolache.mavensample;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void shouldFailRandomly() {
        boolean randomResult = Math.random() < 0.5;

        assertTrue(randomResult);
    }
}
