package com.example.homework7.unit;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class LifeCicleCre { //попробовал ваш пример

    @BeforeClass
    public static void beforeClass() {
        System.out.println("beforeClass");
    }

    @Before
    public void before() {
        System.out.println("before");
    }

    @Test
    public void numbers_add_isCorrect() {
        System.out.println("numbers_add_isCorrect");
        Assert.assertEquals(4, 1+3);
    }

    @Test
    public void numbers_add_isInCorrect() {
        System.out.println("numbers_add_isInCorrect");
        Assert.assertNotEquals(3, 1+3);
    }
    @After
    public void after() {
        System.out.println("after");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("afterClass");
    }


}
