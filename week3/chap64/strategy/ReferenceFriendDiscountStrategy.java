package week3.chap64.strategy;

public class ReferenceFriendDiscountStrategy implements DiscountStrategy {
    // 친구 추천 할인

    @Override
    public double calculateDiscount(double amount) {
        return amount * 0.15;
    }
}
