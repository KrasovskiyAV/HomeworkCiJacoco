package ru.netology.statistic;

public class StatisticsService {
    public long findMax(long[] incomesInBillions) {
        long currentMax = incomesInBillions[0];
        for (long income : incomesInBillions) {
            if (income >= currentMax) {
                currentMax = income;
            }
        }
        return currentMax;
    }

    public long findMin(long[] incomesInBillions) {
        long currentMin = incomesInBillions[0];
        for (long income : incomesInBillions) {
            if (income < currentMin) {
                currentMin = income;
            }
        }
        return currentMin;
    }
}
