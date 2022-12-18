package ru.netology.stats;

public class StatsService {


    public int sumSales(int[] sales) {
        int sum = 0;

        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];
        }
        return sum;
    }

    public int averageSales(int[] sales) {
        return sumSales(sales) / sales.length;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;

    }

    public int minSales(int[] sales) {

        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }


    public int lowAverageSales(int[] sales) {

        int monthCount = 0;
        for (int sale : sales) {
            if (sale <= averageSales(sales))
                monthCount++;
        }
        return monthCount;
    }

    public int highAverageSales(int[] sales) {

        int monthCount = 0;
        for (int sale : sales) {
            if (sale >= averageSales(sales))
                monthCount++;
        }
        return monthCount;
    }
}
