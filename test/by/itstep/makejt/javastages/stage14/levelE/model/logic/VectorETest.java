package by.itstep.makejt.javastages.stage14.levelE.model.logic;

import org.junit.Test;

import static org.junit.Assert.*;

public class VectorETest {

    @Test
    public void testCountElementsBasic() {
        double[] array = {1.0, 5.5, -3.0, 4.2, 5.3, -10, 20};
        double expected = 9.5;
        double actual = VectorE.countElements(array);
        assertEquals(expected, actual, 0.1);
    }

    @Test(expected = RuntimeException.class)
    public void testWithoutNegativeNumbers() {
        double[] array = {1.0, 5.5, 3.0, 4.2, 5.3, 10, 20};
        VectorE.countElements(array);
    }

    @Test(expected = RuntimeException.class)
    public void testWithOneElement() {
        double[] array = {5.5};
        VectorE.countElements(array);
    }

    @Test(expected = RuntimeException.class)
    public void testWithOneNegativeNumbers() {
        double[] array = {1.0, 5.5, 3.0, -4.2, 5.3, 10, 20};
        VectorE.countElements(array);
    }

    @Test(expected = RuntimeException.class)
    public void testWithNull() {
        VectorE.countElements(null);
    }

    @Test(expected = RuntimeException.class)
    public void testWithEmptyArray() {
        VectorE.countElements(new double[0]);
    }


//    @Test
//    public void testFindFirstIndex(){
//        double[] array = {1.0, 5.5, - 3.0, 4.2, 5.3, - 10, 20};
//        int expected = 2;
//        int actual = VectorE.findFirstIndex(array);
//        assertEquals(expected, actual);
//
//    }
//
//    @Test
//    public void testFindLastIndex(){
//        double[] array = {1.0, 5.5, - 3.0, 4.2, 5.3, - 10, 20};
//        int expected = 5;
//        int actual = VectorE.findLastIndex(array);
//        assertEquals(expected, actual);
//    }


}
