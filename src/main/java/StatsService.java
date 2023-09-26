public class StatsService {

    public int allSales(int allSales[]) {
        int sum = 0;
        for (int value : allSales) {
            sum += value;
        }
        return sum;
    }

    public int averageSaleInAMonth(int[] months) {
        int fullSum = allSales(months);

        int average = fullSum / months.length;
        return average;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int MonthsWithLowestSales(int[] lowestSales) {
        int lowMonth = 0;
        int countMonths = 0;
        for (int i = 0; i < lowestSales.length; i++) {
            lowMonth = lowMonth + lowestSales[i];
        }
        lowMonth = lowMonth / lowestSales.length;

        for (int i = 0; i < lowestSales.length; i++) {
            if (lowMonth > lowestSales[i]) {
                countMonths++;
            }
        }
        return countMonths;
    }

    public int MonthsWithMaxSales(int[] maxMonthsSales) {
        int maxMonth = 0;
        int countMonths = 0;
        for (int i = 0; i < maxMonthsSales.length; i++) {
            maxMonth = maxMonth + maxMonthsSales[i];
        }

        for (int i = 0; i < maxMonthsSales.length; i++) {
            if (maxMonthsSales[i] > maxMonth) {
                countMonths++;
            }
        }
        return countMonths;
    }
}