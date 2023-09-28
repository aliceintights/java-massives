import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void sumOfAllSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAmount = 180;
        int actualAmount = service.allSales(sales);

        Assertions.assertEquals(expectedAmount, actualAmount);
    }

    @Test
    public void monthlyAverage() {
        StatsService service = new StatsService();
        int[] average = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAverage = 15;
        int actualAverage = service.averageSaleInAMonth(average);

        Assertions.assertEquals(expectedAverage, actualAverage);
    }

    @Test
    public void returnMaxSalesAMonth() {
        StatsService service = new StatsService();
        long[] maxMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMaxMonth = 8;
        int actualMaxMonth = service.maxSales(maxMonth);

        Assertions.assertEquals(expectedMaxMonth, actualMaxMonth);
    }

    @Test
    public void returnMinSalesAMonth() {
        StatsService service = new StatsService();
        long[] minMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMinMonth = 9;
        int actualMinMonth = service.minSales(minMonth);

        Assertions.assertEquals(expectedMinMonth, actualMinMonth);
    }

    @Test

    public void returnLowestSales() {
        StatsService service = new StatsService();
        int[] lowestMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedLowMonth = 5;
        int actualLowMonth = service.monthsWithLowestSales(lowestMonth);

        Assertions.assertEquals(expectedLowMonth, actualLowMonth);
    }

    @Test
    public void returnMaxSales() {
        StatsService service = new StatsService();
        int[] maxSalesMonths = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMaxMonths = 5;
        int actualMaxMonths = service.monthsWithLowestSales(maxSalesMonths);

        Assertions.assertEquals(expectedMaxMonths, actualMaxMonths);
    }
}

