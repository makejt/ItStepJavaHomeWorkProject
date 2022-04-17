package by.itstep.makejt.javastages.stage13.task5.model.logic;

import by.itstep.makejt.javalesson.levelA.task1.model.logic.NonZeroElement;
import org.junit.Test;

import static org.junit.Assert.*;

public class ExamResultTest {

    private final int[] ARRAY = {5, 4, 4, 5, 3, 4, 3, 4, 5, 3, 4, 4, 3, 4, 4,
            3, 5, 3, 3, 4, 5, 5, 5, 5, 4, 5, 5, 5, 2, 5};

    @Test
    public void testSumOfMarks() {
        int expected = 123;
        int actual = ExamResult.sumOfMarks(ARRAY);
        assertEquals(expected, actual);
    }

    @Test
    public void testCountFives() {
        int expected = 12;
        int actual = ExamResult.countFives(ARRAY);
        assertEquals(expected, actual);
    }

    @Test
    public void testCountFours() {
        int expected = 10;
        int actual = ExamResult.countFours(ARRAY);
        assertEquals(expected, actual);
    }

    @Test
    public void testCountTriplets() {
        int expected = 7;
        int actual = ExamResult.countTriplets(ARRAY);
        assertEquals(expected, actual);
    }

    @Test
    public void testCountDeuces() {
        int expected = 1;
        int actual = ExamResult.countDeuces(ARRAY);
        assertEquals(expected, actual);
    }

    @Test
    public void testCountZeros() {
        int expected = 0;
        int actual = ExamResult.countZeros(ARRAY);
        assertEquals(expected, actual);
    }

    @Test
    public void testPercentFives() {
        double expected = 40;
        double actual = ExamResult.percentFives(12, 30);
        assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testPercentFours() {
        double expected = 33.3;
        double actual = ExamResult.percentFives(10, 30);
        assertEquals(expected, actual, 0.1);
    }

    @Test
    public void testPercentTriplets() {
        double expected = 23.3;
        double actual = ExamResult.percentTriplets(7, 30);
        assertEquals(expected, actual, 0.1);
    }

    @Test
    public void testPercentDeuces() {
        double expected = 3.4;
        double actual = ExamResult.percentDeuces(1, 30);
        assertEquals(expected, actual, 0.1);
    }

    @Test
    public void testPercentUnits() {
        double expected = 0;
        double actual = ExamResult.percentUnits(0, 30);
        assertEquals(expected, actual, 0.1);
    }

    @Test
    public void testPercentZeros() {
        double expected = 0;
        double actual = ExamResult.percentZeros(0, 30);
        assertEquals(expected, actual, 0.1);
    }

    @Test
    public void testWithNull() {
        int expected = -1;
        int actual = ExamResult.sumOfMarks(null);
        assertEquals(expected, actual);
    }

    @Test
    public void testWithEmptyObject() {
        int expected = -1;
        int actual = ExamResult.sumOfMarks(new int[0]);
        assertEquals(expected, actual);
    }
}
