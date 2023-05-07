package ru.netology.stats;

public class StatsService {
    public long sum(long[] sales) {
        long totalSum = 0;
        for (long sale : sales) {
            totalSum += sale;
        }
        return totalSum;
    }

    public long average(long[] sales) {
        if (sales.length == 0) {
            return 0;
        }
        return sum(sales) / sales.length;
    }

    public int monthMaxSale(long[] sales) {
        int month = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[month]) {
                month = i;
            }

        }
        return month + 1;
    }

    public int monthMinSale(long[] sales) {
        int month = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[month]) {
                month = i;
            }

        }
        return month + 1;
    }

    public int monthBelowAverage(long[] sales) {
        int counter = 0;
        for (long sale : sales) {
            if (sale < average(sales)) {
                counter++;

            }
        }
        return counter;
    }

    public int monthOverAverage(long[] sales) {
        int counter = 0;
        long averageSale = average(sales);
        for (long sale : sales) {
            if (sale > averageSale) {
                counter++;

            }
        }
        return counter;
    }

}

