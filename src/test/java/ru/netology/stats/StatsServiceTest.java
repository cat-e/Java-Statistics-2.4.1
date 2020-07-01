package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatsServiceTest {

    private static final int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    void testYearRevenue() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;

        int actual = service.testYearRevenue(sales);

        assertEquals(expected, actual);
    }

    @Test
    void testAverageMonthlySales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;

        int actual = service.testAverageMonthlySales(sales);

        assertEquals(expected, actual);

    }

    @Test
    void testMaxMonthSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;

        int actual = service.testMaxMonthSales(sales);

        assertEquals(expected, actual);
    }

    @Test
    void testMinMonthSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;

        int actual = service.testMinMonthSales(sales);

        assertEquals(expected, actual);
    }

    @Test
    void testMonthsAmountWithSalesLowerAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.testMonthsAmountWithSalesLowerAverage(sales);

        assertEquals(expected, actual);
    }

    @Test
    void testMonthsAmountWithSalesHigherAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.testMonthsAmountWithSalesHigherAverage(sales);

        assertEquals(expected, actual);
    }
}
