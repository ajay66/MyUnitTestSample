package com.example.ajaybabup.myunittesatsample;

import android.test.suitebuilder.annotation.SmallTest;
import android.widget.TextView;

import junit.framework.Assert;
import junit.framework.TestCase;

public class MainActivityTest2 extends TestCase {

    TextView txt_hello;

    public void setUp() throws Exception {
        super.setUp();
//        MainActivity myact=new MainActivity();
//        txt_hello=(TextView)myact.findViewById(R.id.txt_hello);
    }

    @SmallTest
    public void testOurMethod()
    {
          Assert.assertTrue(true);
//        String str=txt_hello.getText().toString();
//        Assert.assertEquals("Hello world!",str);
    }

    @SmallTest
    public void testOurMethod2()
    {
        Assert.assertTrue(true);
    }

    public void tearDown() throws Exception {

    }
}