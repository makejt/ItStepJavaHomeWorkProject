package by.itstep.makejt.javastages.stage11.task04.model.logic;

import org.junit.Assert;
import org.junit.Test;

public class FactorialTest {

    @Test
    public void countFactorialPositiveTest(){
        int number = 5;
        int expected = 120;
        int actual = Factorial.countFactorial(number);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void countFactorialPositiveTestWithOne(){
        int number = 1;
        int expected = 1;
        int actual = Factorial.countFactorial(number);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void countFactorialPositiveTestWithZero(){
        int number = 0;
        int expected = 1;
        int actual = Factorial.countFactorial(number);
        Assert.assertEquals(expected, actual);
    }
}
