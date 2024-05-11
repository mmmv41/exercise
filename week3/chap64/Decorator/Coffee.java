package week3.chap64.Decorator;

// Concrete Component
public class Coffee implements Beverage {

    // Beverage 들의 속성 구현해야함 
    @Override
    public String getDescription() {
        return "Coffee";
    }

    @Override
    public double cost() {
        return 7.0;
    }
}
