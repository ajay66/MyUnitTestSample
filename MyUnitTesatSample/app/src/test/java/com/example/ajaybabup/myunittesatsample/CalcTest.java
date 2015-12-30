package com.example.ajaybabup.myunittesatsample;

import android.test.suitebuilder.annotation.SmallTest;

import junit.framework.Assert;
import junit.framework.TestCase;

public class CalcTest extends TestCase {

    MainActivity myact;

    public void setUp() throws Exception {
        super.setUp();

         myact=new MainActivity();
    }

    @SmallTest
    public void testCalc()
    {
        int result=myact.calc(20,20);
        Assert.assertEquals(40,result);
    }
    public void tearDown() throws Exception {

    }
}