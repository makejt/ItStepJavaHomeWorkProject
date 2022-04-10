package by.itstep.makejt.javastages.stage11.task02.model.logic;

import org.junit.Assert;
import org.junit.Test;

public class ReverseNumberTest {

    @Test
    public void reverseNumberPositiveTest(){
        int number = 2900;
        int expected = 92;
        int actual = ReverseNumber.reverseNumber(number);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void reverseNumberPositiveTestWithZero(){
        int number = 12345678;
        int expected = 87654321;
        int actual = ReverseNumber.reverseNumber(number);
        Assert.assertEquals(expected, actual);
    }

}
