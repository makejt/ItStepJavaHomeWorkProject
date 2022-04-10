package by.itstep.makejt.javastages.stage11.addtask01.model.logic;

import org.junit.Assert;
import org.junit.Test;

public class NOK_NODTest {

    @Test
    public void countNOD(){
        int number1 = 12;
        int number2 = 20;
        int expected = 4;
        int actual = NOK_NOD.countNOD(number1, number2);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void countNOK(){
        int number1 = 12;
        int number2 = 20;
        int expected = 60;
        int actual = NOK_NOD.countNOK(number1, number2);
        Assert.assertEquals(expected, actual);
    }
}
