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

    public int monthsWithLowestSales(int[] lowestSales) {
        int lowMonth = averageSaleInAMonth(lowestSales);
        int countMonths = 0;

        for (int i = 0; i < lowestSales.length; i++) {
            if (lowMonth > lowestSales[i]) {
                countMonths++;
            }
        }
        return countMonths;
    }

    public int monthsWithMaxSales(int[] maxMonthsSales) {
        int maxMonth = averageSaleInAMonth(maxMonthsSales);
        int countMonths = 0;

        for (int i = 0; i < maxMonthsSales.length; i++) {
            if (maxMonthsSales[i] > maxMonth) {
                countMonths++;
            }
        }
        return countMonths;
    }
}