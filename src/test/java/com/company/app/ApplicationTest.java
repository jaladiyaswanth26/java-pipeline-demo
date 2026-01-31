package com.company.app;

import org.junit.Assert;
import org.junit.Test;

public class ApplicationTest {

    @Test
    public void testAdd() {
        Assert.assertEquals(30, Application.add(10, 20));
    }
}
