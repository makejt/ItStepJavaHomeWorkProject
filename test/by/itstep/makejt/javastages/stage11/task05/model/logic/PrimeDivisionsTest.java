package by.itstep.makejt.javastages.stage11.task05.model.logic;

import org.junit.Assert;
import org.junit.Test;

public class PrimeDivisionsTest {
    @Test
    public void findPrimeDivisionsPositiveTest(){
        int number = 10;
        String expected = "Prime divisions of this number: 2 5 ";
        String actual = PrimeDivisions.findPrimeDivisions(number);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void findPrimeDivisionsTestWithOne(){
        int number = 1;
        String expected = "This number hasn't prime divisions";
        String actual = PrimeDivisions.findPrimeDivisions(number);
        Assert.assertEquals(expected,actual);
    }

   }
