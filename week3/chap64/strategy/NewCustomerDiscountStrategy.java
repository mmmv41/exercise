package week3.chap64.strategy;

public class NewCustomerDiscountStrategy implements DiscountStrategy {
    @Override
    public double calculateDiscount(double amount) {
        
        return amount * 0.2; // 20% 할인
    }
}
