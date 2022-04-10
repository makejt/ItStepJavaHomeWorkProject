package by.itstep.makejt.javastages.stage11.addtask02.model.logic;


import org.junit.Assert;
import org.junit.Test;

public class ArmstrongNumberTest {

    @Test
    public void findArmstrongNumberTwoDigitsNumber(){
        int count = 2;
        String expected = "There is not Armstrong number";
        String actual = ArmstrongNumber.findArmstrongNumber(count);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void findArmstrongNumberThreeDigitsNumber(){
        int count = 3;
        String expected = "Armstrong numbers: 153, 370, 371, 407";
        String actual = ArmstrongNumber.findArmstrongNumber(count);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void findArmstrongNumberFourDigitsNumber(){
        int count = 4;
        String expected = "Armstrong numbers: 1634, 8208, 9474";
        String actual = ArmstrongNumber.findArmstrongNumber(count);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void findArmstrongNumberFiveDigitsNumber(){
        int count = 5;
        String expected = "Armstrong numbers: 54748, 92727, 93084";
        String actual = ArmstrongNumber.findArmstrongNumber(count);
        Assert.assertEquals(expected, actual);
    }
}
