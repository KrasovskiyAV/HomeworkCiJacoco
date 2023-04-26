package ru.netology.statistic;

public class StatisticsService {
    public long findMax(long[] incomesInBillions) {
        long currentMax = incomesInBillions[0];
        for (long income : incomesInBillions) {
            if (income > currentMax) {
                currentMax = income;
            }
        }
        return currentMax;
    }
}
