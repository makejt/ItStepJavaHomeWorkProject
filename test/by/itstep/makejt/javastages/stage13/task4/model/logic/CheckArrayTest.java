package by.itstep.makejt.javastages.stage13.task4.model.logic;

import org.junit.Test;
import static org.junit.Assert.*;

public class CheckArrayTest {
    @Test
    public void testCountEvenElementsBasic(){
        int [] array = {2, 4, 6, 7, 10, 24};
        int expected = 5;
        int actual = CheckArray.CountEvenElements(array);
        assertEquals(expected, actual);
    }

    @Test
    public void testCountEvenElementsWithoutEvenElements(){
        int [] array = {1, 7, 9, 11, 13, 27};
        int expected = 0;
        int actual = CheckArray.CountEvenElements(array);
        assertEquals(expected, actual);
    }

    @Test
    public void testCountEvenElementsWithZero(){
        int [] array = {2, 4, 0, 8, 7, 24};
        int expected = 5;
        int actual = CheckArray.CountEvenElements(array);
        assertEquals(expected, actual);
    }

    @Test
    public void testCountEvenElementsWithOneElement(){
        int [] array = {28};
        int expected = 1;
        int actual = CheckArray.CountEvenElements(array);
        assertEquals(expected, actual);
    }

    @Test
    public void testCountEvenElementsWithNull(){
       int expected = -1;
       int actual = CheckArray.CountEvenElements(null);
       assertEquals(expected, actual);
    }

    @Test
    public void testCountEvenElementsWithEmptyArray(){
        int expected = -1;
        int actual = CheckArray.CountEvenElements(new int[0]);
        assertEquals(expected, actual);
    }

    @Test
    public void testCountNotEvenElementsBasic(){
        int [] array = {2, 4, 6, 7, 10, 24};
        int expected = 1;
        int actual = CheckArray.CountNotEvenElements(array);
        assertEquals(expected, actual);
    }

    @Test
    public void testCountNotEvenElementsWithoutNotEvenElements(){
        int [] array = {2, 10, 14, 0, 0, 28};
        int expected = 0;
        int actual = CheckArray.CountNotEvenElements(array);
        assertEquals(expected, actual);
    }

    @Test
    public void testCountNotEvenElementsWithZero(){
        int [] array = {2, 4, 0, 8, 7, 24};
        int expected = 1;
        int actual = CheckArray.CountNotEvenElements(array);
        assertEquals(expected, actual);
    }

    @Test
    public void testCountNotEvenElementsWithOneElement() {
        int[] array = {28};
        int expected = 0;
        int actual = CheckArray.CountNotEvenElements(array);
        assertEquals(expected, actual);
    }

    @Test
    public void testCountNotEvenElementsWithNull(){
        int expected = -1;
        int actual = CheckArray.CountNotEvenElements(null);
        assertEquals(expected, actual);
    }

    @Test
    public void testCountNotEvenElementsWithEmptyArray(){
        int expected = -1;
        int actual = CheckArray.CountNotEvenElements (new int[0]);
        assertEquals(expected, actual);
    }



}
