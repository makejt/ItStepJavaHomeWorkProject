package by.itstep.makejt.javastages.stage15.levelA3.model.logic;

import org.junit.Test;
import static org.junit.Assert.*;

public class CheckArrayTest {

    @Test
    public void testFindIndexOfColumns() {
        int [][] array = {{1, 6, 3, 1, 7}, {3, 2, 2, 6, 5},
        {4, 3, 2, 1, 5}, {5, 4, 1, 1, 5}};
        int number = 5;
        int expected = 3;
        int actual = CheckArray.findIndexOfColumns(array, 4, 5, number);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindIndexOfColumnsWithoutElementsLessN() {
        int [][] array = {{7, 6, 3, 1, 7}, {3, 2, 2, 6, 5},
                {4, 3, 9, 1, 5}, {5, 4, 1, 1, 5}};
        int number = 5;
        int expected = -1;
        int actual = CheckArray.findIndexOfColumns(array, 4, 5, number);
        assertEquals(expected, actual);
    }



    @Test
    public void testFindIndexOfColumnsWithNull() {
        int [][] array = null;
        int number = 5;
        int expected = -1;
        int actual = CheckArray.findIndexOfColumns(array, 0, 0, number);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindIndexOfColumnsWithEmptyArray() {
        int [][] array = new int [0][0];
        int number = 5;
        int expected = -1;
        int actual = CheckArray.findIndexOfColumns(array, 0, 0, number);
        assertEquals(expected, actual);
    }


}
