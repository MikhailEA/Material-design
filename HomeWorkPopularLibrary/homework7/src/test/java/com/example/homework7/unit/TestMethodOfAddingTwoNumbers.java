package com.example.homework7.unit;



import com.example.homework7.HomeWork_7_1.AdditionOfTwoNumbers;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestMethodOfAddingTwoNumbers {

    private AdditionOfTwoNumbers additionOfTwoNumbers;

    @Before
    public void before() {

        additionOfTwoNumbers = new AdditionOfTwoNumbers();
    }
    @Test
    public void PositiveScenario() {
        int theAmount = additionOfTwoNumbers.MethodOfAddingTwoNumbers(345,234);
        Assert.assertEquals(theAmount, 579);
    }

    @Test
    public void NegativeScenario() {
        int theAmount = additionOfTwoNumbers.MethodOfAddingTwoNumbers(345,234);
        Assert.assertNotEquals(theAmount,580);
    }
}
