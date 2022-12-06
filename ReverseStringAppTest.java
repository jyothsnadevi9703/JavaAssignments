package org.example;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
/**
 * Hello world!
 *
 */

public class AppTest
{
    @Test
    public void testReverseString()
    {
        assertEquals("oyj",App.ReverseString(new String("jyo")));
    }

}

