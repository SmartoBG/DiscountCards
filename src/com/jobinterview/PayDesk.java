package com.jobinterview;

import java.math.BigDecimal;

public class PayDesk {

    private PayDesk() {
    }

    public static void checkout(double valueOfPurchase, DiscountCard discountCard, double previousMonthTurnover) {
        double discountRate = PayDesk.discountRateCalculation(BigDecimal.valueOf(previousMonthTurnover), discountCard);
        BigDecimal discount = BigDecimal.valueOf(discountRate).multiply(BigDecimal.valueOf(valueOfPurchase));
        BigDecimal total = BigDecimal.valueOf(valueOfPurchase).subtract(discount);
        System.out.printf("Purchase value: $%.2f%nDiscount rate: %.1f%%%nDiscount: $%.2f%nTotal: $%.2f%n", valueOfPurchase, discountRate * 100, discount, total);

    }

    private static double discountRateCalculation(BigDecimal previousMonthTurnover, DiscountCard discountCard) {

        double finalDiscountRate = discountCard.getInitalDiscountRate() + discountCard.addedTurnoverDiscountRate(previousMonthTurnover);
        return finalDiscountRate;
    }

}
