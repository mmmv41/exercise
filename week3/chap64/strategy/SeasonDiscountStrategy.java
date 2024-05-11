package week3.chap64.strategy;

public class SeasonDiscountStrategy implements DiscountStrategy {
    // 시즌 할인 
    
    @Override
    public double calculateDiscount(double amount) {
        return amount * 0.1;
    }
}
