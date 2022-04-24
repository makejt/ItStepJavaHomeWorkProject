package by.itstep.makejt.javastages.stage15.generalTask.model.logic;

import org.junit.Assert;

import static org.junit.Assert.*;

import org.junit.Test;

public class AcademicPerformanceTest {

    @Test
    public void testFindGroupWithMaxAverageMark() {
        int[][] array = {{5, 6, 7, 8}, {10, 8, 9, 9}, {4, 5, 6, 7}};
        int expected = 2;
        int actual = AcademicPerformance.findGroupWithMaxAverageMark(array, 3, 4);
        assertEquals(expected, actual);

    }

    @Test
    public void testFindGroupWithMinAverageMark() {
        int[][] array = {{5, 5, 7, 4}, {10, 8, 9, 9}, {8, 9, 6, 7}};
        int expected = 1;
        int actual = AcademicPerformance.findGroupWithMinAverageMark(array, 3, 4);
        assertEquals(expected, actual);

    }

    @Test
    public void testFindGroupWithMaxCountOfTens() {
        int[][] array = {{8, 10, 10, 4}, {10, 8, 9, 9}, {8, 10, 10, 10}};
        int expected = 3;
        int actual = AcademicPerformance.findGroupWithMaxCountOfTens (array, 3, 4);
        assertEquals(expected, actual);

    }

    @Test
    public void testFindGroupWithUnsatisfactoryMarks() {
        int[][] array = {{8, 1, 1, 4}, {10, 8, 9, 9}, {8, 2, 10, 10}};
        String expected = "1 3 ";
        String actual = AcademicPerformance.findGroupWithUnsatisfactoryMarks (array, 3, 4);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindAverageAcademyPerformance() {
        int[][] array = {{8, 1, 1, 4}, {10, 8, 9, 9}, {8, 2, 10, 10}};
        double expected = 6.7;
        double actual = AcademicPerformance.findAverageAcademyPerformance (array, 3, 4);
        assertEquals(expected, actual, 0.1);
    }


}
