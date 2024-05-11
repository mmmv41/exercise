package week3.chap64.Decorator;

// Decorator
public abstract class BeverageDecorator implements Beverage {
    // 추상 클래스 -> 이 클래스가 직접 인스턴스화될 수 없고, 상속을 통해 구체적인 데코레이터 클래스를 만들어야한다.
    // 크림, 설탕들은 데코레이터로 분류 

    protected Beverage beverage;

    public BeverageDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription();
    }

    @Override
    public double cost() {
        return beverage.cost();
    }
}
