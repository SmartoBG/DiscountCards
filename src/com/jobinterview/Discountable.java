package com.jobinterview;

import java.math.BigDecimal;

public interface Discountable {

    double calculateAddedTurnoverDiscountRate(BigDecimal previousMonthTurnover);

    enum CardType {
        BRONZE(0.00),
        SILVER(0.02),
        GOLD(0.02);

        private final double discount;

        CardType(double discount) {
            this.discount = discount;
        }

        public double getDiscount() {
            return discount;
        }
    }


}
