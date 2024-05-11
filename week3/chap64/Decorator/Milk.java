package week3.chap64.Decorator;

// Concrete Decorator
public class Milk extends BeverageDecorator {

    public Milk(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Milk"; // 부모클래스의 getDescription에서 Milk를 더함
    }

    @Override
    public double cost() {
        return super.cost() + 0.5;
    }
}
