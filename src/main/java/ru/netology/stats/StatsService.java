package ru.netology.stats;

public class StatsService {
    long[] sales = {
            8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
    };


    public long salesSum(long[] sales) {
        long sum = 0; //сумма продаж
        for (long sale : sales) {
            sum += sale;

        }
        return sum;


    }

    public long averageSales(long[] sales) {
        return salesSum(sales) / 12;

    }


    public long getMaxSales(long[] sales) {
        long maxSales = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[(int) maxSales]) {
                maxSales = i;

            }
        }
        return sales[(int) maxSales];
    }


    public long getMinSales(long[] sales) {
        long minSales = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[(int) minSales]) {
                minSales = i;
            }
        }
        return sales[(int) minSales];
    }

    public int worstMonthsAmount(long[] sales) {
        int amount = 0;
        long average = averageSales(sales);
        for (long sale : sales) {
            if (sale < average) {
                amount = amount + 1;
            }
        }
        return amount;

    }


    public int bestMonthsAmount(long[] sales) {
        return sales.length - worstMonthsAmount(sales);
    }
}






