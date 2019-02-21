package com.jobinterview;

import java.math.BigDecimal;

public class GoldCard extends DiscountCard {
    public static final double MAX_DISCOUNT_RATE = 10d;

    public GoldCard(String cardOwner) {
        super(cardOwner);
        this.setCardType(CardType.GOLD);
        this.setInitialDiscount(this.getCardType().getDiscount());
    }

    @Override
    public double calculateAddedTurnoverDiscountRate(BigDecimal previousMonthTurnover) {
        double discountRate = 0;
        for (int i = 1; i <= (MAX_DISCOUNT_RATE - this.getInitalDiscountRate() * 100); i++) {
            if (previousMonthTurnover.compareTo(BigDecimal.valueOf(100 * i)) >= 0) {
                discountRate = i / 100.0;
            }
        }
        return discountRate;
    }

}
