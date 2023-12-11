public class StatsService {

    public int allSales(int allSales[]) {
        int sumOfAllSales = 0;
        for (int value : allSales) {
            sumOfAllSales += value;
        }
        return sumOfAllSales;
    }

    public int averageSaleInAMonth(int[] months) {
        int monthlyAverageSum = allSales(months);

        int averageSalesAMonth = monthlyAverageSum / months.length;
        return averageSalesAMonth;
    }

    public int maxSales(long[] sales) {
        int maxSumInAMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxSumInAMonth]) {
                maxSumInAMonth = i;
            }
        }
        return maxSumInAMonth + 1;
    }

    public int minSales(long[] sales) {
        int minSumInAMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minSumInAMonth]) {
                minSumInAMonth = i;
            }
        }
        return minSumInAMonth + 1;
    }

    public int monthsWithLowestSales(int[] lowestSales) {
        int sumLowerThanAverage = averageSaleInAMonth(lowestSales);
        int countMonths = 0;

        for (int i = 0; i < lowestSales.length; i++) {
            if (sumLowerThanAverage > lowestSales[i]) {
                countMonths++;
            }
        }
        return countMonths;
    }

    public int monthsWithMaxSales(int[] maxMonthsSales) {
        int sumHigherThanAverage = averageSaleInAMonth(maxMonthsSales);
        int countMonths = 0;

        for (int i = 0; i < maxMonthsSales.length; i++) {
            if (maxMonthsSales[i] > sumHigherThanAverage) {
                countMonths++;
            }
        }
        return countMonths;
    }
}