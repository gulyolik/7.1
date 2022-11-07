package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.testng.annotations.Test;

public class StatsServiceTest {
    @Test
    public void shouldFindSalesSum() {
        ru.netology.stats.StatsService service = new ru.netology.stats.StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedSum = 180;
        long actualSum = service.salesSum(sales);
        Assertions.assertEquals(expectedSum, actualSum);
    }


    @Test
    public void shouldFindAverageSum() {
        ru.netology.stats.StatsService service = new ru.netology.stats.StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedAverageSum = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18) / 12;
        long actualAverageSum = service.averageSales(sales);
        Assertions.assertEquals(expectedAverageSum, actualAverageSum);
    }


    @Test
    public void shouldFindMaxSum() {
        ru.netology.stats.StatsService service = new ru.netology.stats.StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedMaxSum = 20;
        long actualMaxSum = service.getMaxSales(sales);
        Assertions.assertEquals(expectedMaxSum, actualMaxSum);
    }


    @Test
    public void shouldFindMinSum() {
        ru.netology.stats.StatsService service = new ru.netology.stats.StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedMinSum = 7;
        long actualMinSum = service.getMinSales(sales);
        Assertions.assertEquals(expectedMinSum, actualMinSum);
    }


    @Test
    public void shouldFindUnderAverageMonthsAmount() {
        ru.netology.stats.StatsService service = new ru.netology.stats.StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedWorstMonthsAmount = 5;
        int actualWorstMonthsAmount = service.worstMonthsAmount(sales);
        Assertions.assertEquals(expectedWorstMonthsAmount, actualWorstMonthsAmount);
    }


    @Test
    public void shouldFindHigherThanAverageMonthsAmount() {
        ru.netology.stats.StatsService service = new ru.netology.stats.StatsService();
        long [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedBestMonthsAmount = 7;
        int actualBestMonthsAmount = service.bestMonthsAmount(sales);
        Assertions.assertEquals(expectedBestMonthsAmount, actualBestMonthsAmount);
    }
}




