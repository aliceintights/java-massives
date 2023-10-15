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
        int maxMonthSales = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonthSales]) {
                maxMonthSales = i;
            }
        }
        return maxMonthSales + 1;
    }

    public int minSales(long[] sales) {
        int minMonthSales = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonthSales]) {
                minMonthSales = i;
            }
        }
        return minMonthSales + 1;
    }

    public int monthsWithLowestSales(int[] lowestSales) {
        int lowMonthSales = averageSaleInAMonth(lowestSales);
        int countMonths = 0;

        for (int i = 0; i < lowestSales.length; i++) {
            if (lowMonthSales > lowestSales[i]) {
                countMonths++;
            }
        }
        return countMonths;
    }

    public int monthsWithMaxSales(int[] maxMonthsSales) {
        int maxMonthSales = averageSaleInAMonth(maxMonthsSales);
        int countMonths = 0;

        for (int i = 0; i < maxMonthsSales.length; i++) {
            if (maxMonthsSales[i] > maxMonthSales) {
                countMonths++;
            }
        }
        return countMonths;
    }
}