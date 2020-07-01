package ru.netology.stats;

public class StatsService {

    public int testYearRevenue(int[] sales) {
        int sum =0;
        for (int monthSale : sales) {
            sum += monthSale;
        }
        return sum;
    }
    public int testAverageMonthlySales(int[] sales)  {
        int averageSale = testYearRevenue(sales) / sales.length;
        return averageSale;
    }
    public int testMaxMonthSales(int[] sales) {
        int currentMaxSalesMonth = 1;
        int currentMax = sales[0];
        for(int i = 1; i < sales.length; i++) {
            if (sales[i] >= currentMax) {
                currentMax  = sales[i] ;
                currentMaxSalesMonth = i + 1;
            }
        }
        return currentMaxSalesMonth;
    }
    public int testMinMonthSales(int[] sales) {
        int currentMinSalesMonth = 1;
        int currentMin = sales[0];
        for(int i = 1; i < sales.length; i++) {
            if (sales[i] <= currentMin) {
                currentMin  = sales[i] ;
                currentMinSalesMonth = i + 1;
            }
        }
        return currentMinSalesMonth;
    }
    public int testMonthsAmountWithSalesLowerAverage(int[] sales) {
        int monthsAmount = 0;
        int sum =0;
        for (int monthSale : sales) {
            sum += monthSale;
        }
       for (int monthSale : sales) {
            if (monthSale < testAverageMonthlySales(sales)) {
                monthsAmount += 1;
            }
        }
        return monthsAmount;
    }
    public int testMonthsAmountWithSalesHigherAverage(int[] sales) {
        int monthsAmount = 0;
        int sum = 0;
        for (int monthSale : sales) {
            sum += monthSale;
        }

        for (int monthSale : sales) {
            if (monthSale > testAverageMonthlySales(sales)) {
                monthsAmount += 1;
            }
        }
        return monthsAmount;

    }


}
