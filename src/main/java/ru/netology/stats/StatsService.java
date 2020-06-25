package ru.netology.stats;

public class StatsService {

    int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    public int yearRevenue(int[] sales) {
        int sum =0;
        for (int monthSale : sales) {
            sum += monthSale;
        }
        return sum;
    }
    public int averageMonthlySales(int[] sales)  {
        int sum =0;
        for (int monthSale : sales) {
            sum += monthSale;
        }
        int averageSale = sum / sales.length;
        return averageSale;
    }
    public int maxMonthSales(int[] sales) {
        int currentMaxSalesMonth = 1;
        int currentMax = sales[0];
        for (int monthSale : sales) {
            if (currentMax <= monthSale) {
                currentMax = monthSale;
                currentMaxSalesMonth += 1;
            }
        }
        return currentMaxSalesMonth;
    }
    public int minMonthSales(int[] sales) {
        int currentMinSalesMonth = 1;
        int currentMin = sales[0];
        for (int monthSale : sales) {
            if (currentMin >= monthSale) {
                currentMin = monthSale;
                currentMinSalesMonth += 1;
            }
        }
        return currentMinSalesMonth;
    }
    public int monthsAmountWithSalesLowerAverage(int[] sales) {
        int monthsAmount = 0;
        int sum =0; // мб не верно
        for (int monthSale : sales) {
            sum += monthSale;
        }
        int averageSale = sum / sales.length;


        for (int monthSale : sales) {
            if (monthSale < averageSale) {
                monthsAmount += 1;
            }
        }
        return monthsAmount;
    }
    public int monthsAmountWithSalesHigherAverage(int[] sales) {
        int monthsAmount = 0;
        int sum = 0; // мб не верно
        for (int monthSale : sales) {
            sum += monthSale;
        }
        int averageSale = sum / sales.length;


        for (int monthSale : sales) {
            if (monthSale > averageSale) {
                monthsAmount += 1;
            }
        }
        return monthsAmount;


    }


}
