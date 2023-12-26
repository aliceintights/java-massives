public class StatsService {

    public int allSales(int allSales[]) {
        int sumOfAllSales = 0;
        for (int value : allSales) {
            sumOfAllSales += value;
        }
        return sumOfAllSales;
    }

    public int averageSaleInAMonth(int[] months) {
        int averageSaleSumAMonth = allSales(months);

        int averageSalesAMonth = averageSaleSumAMonth / months.length;
        return averageSalesAMonth;
    }

    public int maxSales(long[] sales) {
        int monthNumberWithHighestSales = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[monthNumberWithHighestSales]) {
                monthNumberWithHighestSales = i;
            }
        }
        return monthNumberWithHighestSales + 1;
    }

    public int minSales(long[] sales) {
        int monthNumberWithLowestSales = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[monthNumberWithLowestSales]) {
                monthNumberWithLowestSales = i;
            }
        }
        return monthNumberWithLowestSales + 1;
    }

    public int monthsWithLowestSales(int[] lowestSales) {
        int averageSaleAmount = averageSaleInAMonth(lowestSales);
        int countMonths = 0;

        for (int i = 0; i < lowestSales.length; i++) {
            if (averageSaleAmount > lowestSales[i]) {
                countMonths++;
            }
        }
        return countMonths;
    }

    public int monthsWithMaxSales(int[] maxMonthsSales) {
        int averageSaleAmount = averageSaleInAMonth(maxMonthsSales);
        int countMonths = 0;

        for (int i = 0; i < maxMonthsSales.length; i++) {
            if (maxMonthsSales[i] > averageSaleAmount) {
                countMonths++;
            }
        }
        return countMonths;
    }
}