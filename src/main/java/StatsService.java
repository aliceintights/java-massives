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
        int maxSales = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxSales]) {
                maxSales = i;
            }
        }
        return maxSales + 1;
    }

    public int minSales(long[] sales) {
        int minSales = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minSales]) {
                minSales = i;
            }
        }
        return minSales + 1;
    }

    public int monthsWithLowestSales(int[] lowestSales) {
        int monthsWithLowestSales = averageSaleInAMonth(lowestSales);
        int countMonths = 0;

        for (int i = 0; i < lowestSales.length; i++) {
            if (monthsWithLowestSales > lowestSales[i]) {
                countMonths++;
            }
        }
        return countMonths;
    }

    public int monthsWithMaxSales(int[] maxMonthsSales) {
        int monthsWithMaxSales = averageSaleInAMonth(maxMonthsSales);
        int countMonths = 0;

        for (int i = 0; i < maxMonthsSales.length; i++) {
            if (maxMonthsSales[i] > monthsWithMaxSales) {
                countMonths++;
            }
        }
        return countMonths;
    }
}