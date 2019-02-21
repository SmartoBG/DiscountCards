package com.jobinterview;

import java.math.BigDecimal;

public class BronzeCard extends DiscountCard {

    public BronzeCard(String cardOwner) {
        super(cardOwner);
        this.setCardType(CardType.BRONZE);
        this.setInitialDiscount(this.getCardType().getDiscount());
    }

    @Override
    public double calculateAddedTurnoverDiscountRate(BigDecimal previousMonthTurnover) {
        if (previousMonthTurnover.compareTo(BigDecimal.valueOf(300)) < 0 &&
                previousMonthTurnover.compareTo(BigDecimal.valueOf(100)) > 0) {
            return 0.01;
        } else if (previousMonthTurnover.compareTo(BigDecimal.valueOf(300)) > 0) {
            return 0.025;
        }

        return 0;
    }

}
