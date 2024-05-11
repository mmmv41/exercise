package week3.chap64.strategy;

public class DiscountCalculator {
    // 실제 계산하는 클래스 

    private DiscountStrategy discountStrategy;

    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public double calculateDiscount(double amount) {
        if (discountStrategy != null) {
            return discountStrategy.calculateDiscount(amount);
        }
        else {
            return 0; // 할인 없음
        }
    }
}
