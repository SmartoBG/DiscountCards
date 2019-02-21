package com.jobinterview;

import java.math.BigDecimal;

public class SilverCard extends DiscountCard {

    public SilverCard(String cardOwner) {
        super(cardOwner);
        this.setCardType(CardType.SILVER);
        this.setInitialDiscount(this.getCardType().getDiscount());
    }

    @Override
    public double calculateAddedTurnoverDiscountRate(BigDecimal previousMonthTurnover) {

        if (previousMonthTurnover.compareTo(BigDecimal.valueOf(300)) > 0) {
            return 0.015;
        }
        return 0;
    }

}
