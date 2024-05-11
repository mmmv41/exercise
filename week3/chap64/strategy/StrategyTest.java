package week3.chap64.strategy;

public class StrategyTest {
    public static void main(String[] args) {

        DiscountCalculator calculator = new DiscountCalculator(); // 할인 계산기 객체 생성 

        // 신규 가입자 할인
        calculator.setDiscountStrategy(new NewCustomerDiscountStrategy());
        // setDiscountStrategy를 이용 -> 신규 가입자 할인을 계산기에 설정.
        // new 키워드를 사용-> 새로운 할인 전략 객체를 생성. 이를 setDiscountStrategy()에 전달. 전략 패턴을 활용하여 코드의 유연성과 확장성을 높인다.
        double discount1 = calculator.calculateDiscount(10000);
        // 그 후 calculateDiscount() 메서드를 사용하여 해당 할인 전략에 따른 할인 금액을 계산

        System.out.println("신규 가입자 할인 금액: " + discount1);

        ///////////////////////

        calculator.setDiscountStrategy(new SeasonDiscountStrategy());
        double discount2 = calculator.calculateDiscount(10000);

        System.out.println("시즌 할인 가입자 할인 금액: " + discount2);

        ///////////////////////
        
        calculator.setDiscountStrategy(new ReferenceFriendDiscountStrategy());
        double discount3 = calculator.calculateDiscount(10000);

        System.out.println("친구 할인 가입자 할인 금액: " + discount3);
    }
}
