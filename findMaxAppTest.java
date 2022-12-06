package org.example;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import static junit.framework.Assert.assertEquals;

public class AppTest
{
    @org.junit.Test
    public void findMax()
    {
        assertEquals(9,App.findMax(new int[]{5,3,9,1}));
    }

}
