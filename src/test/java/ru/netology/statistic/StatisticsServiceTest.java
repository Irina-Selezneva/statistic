package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StatisticsServiceTest {
    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();
        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }

    @Test
    void findAllNull() {
        StatisticsService service = new StatisticsService();
        long[] incomesInBillions = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        long expected = 0;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }
    @Test
    void findMaxNotFirst() {
        StatisticsService service = new StatisticsService();
        long[] incomesInBillions = {6, 5, 8, 7, 3, 9, 1, 5, 4, 2, 1};
        long expected = 9;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);

    }
}
