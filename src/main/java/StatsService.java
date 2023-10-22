public class StatsService {

    public int allSales(int allSales[]) {
        int sumOfAllSales = 0;
        for (int value : allSales) {
            sumOfAllSales += value;
        }
        return sumOfAllSales;
    }

    public int averageSaleInAMonth(int[] months) {
        int fullSumSales = allSales(months);

        int averageSalesAMonth = fullSumSales / months.length;
        return averageSalesAMonth;
    }

    public int maxSales(long[] sales) {
        int monthWithHighestSales = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[monthWithHighestSales]) {
                monthWithHighestSales = i;
            }
        }
        return monthWithHighestSales + 1;
    }

    public int minSales(long[] sales) {
        int monthWithLowestSales = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[monthWithLowestSales]) {
                monthWithLowestSales = i;
            }
        }
        return monthWithLowestSales + 1;
    }

    public int monthsWithLowestSales(int[] lowestSales) {
        int monthWithSalesLowerThanAverage = averageSaleInAMonth(lowestSales);
        int countMonths = 0;

        for (int i = 0; i < lowestSales.length; i++) {
            if (monthWithSalesLowerThanAverage > lowestSales[i]) {
                countMonths++;
            }
        }
        return countMonths;
    }

    public int monthsWithMaxSales(int[] maxMonthsSales) {
        int monthWithSalesHigherThanAverage = averageSaleInAMonth(maxMonthsSales);
        int countMonths = 0;

        for (int i = 0; i < maxMonthsSales.length; i++) {
            if (maxMonthsSales[i] > monthWithSalesHigherThanAverage) {
                countMonths++;
            }
        }
        return countMonths;
    }
}