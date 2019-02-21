package com.jobinterview;

import java.math.BigDecimal;

public abstract class DiscountCard implements Discountable {

    private String cardOwner;
    private BigDecimal previousMonthTurnover;
    private double initialDiscount;
    private CardType cardType;

    private DiscountCard() {
    }

    public DiscountCard(String cardOwner) {
        this.cardOwner = cardOwner;
    }

    public double addedTurnoverDiscountRate(BigDecimal previousMonthTurnover) {
        this.previousMonthTurnover = previousMonthTurnover;
        double discount = calculateAddedTurnoverDiscountRate(previousMonthTurnover);
        return discount;
    }

    public String getCardOwner() {
        return cardOwner;
    }

    public CardType getCardType() {
        return cardType;
    }

    public void setCardType(CardType cardType) {
        this.cardType = cardType;
    }

    public double getInitalDiscountRate() {
        return initialDiscount;
    }

    void setInitialDiscount(double initialDiscount) {
        this.initialDiscount = initialDiscount;
    }

    public BigDecimal getPreviousMonthTurnover() {
        return previousMonthTurnover;
    }

}
