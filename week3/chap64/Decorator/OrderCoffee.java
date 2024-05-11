package week3.chap64.Decorator;

public class OrderCoffee {
    public static void main(String[] args){
        // 불필요한 if문 줄일 수 있다. Coffee 클래스에서 가격만 바꾸면 다 가격이 바뀜. 

        // 현재 Milk 추가 가능
        Beverage coffee = new Coffee();
        System.out.println(coffee.getDescription() + ": $" + coffee.cost());

        Beverage coffeeWithMilk = new Milk(coffee); // 위에서 만든 coffee 변수를 생성자로 넣고. Milk로 감싼다.  
        System.out.println(coffeeWithMilk.getDescription() + ": $" + coffeeWithMilk.cost());

        Beverage coffeeWithMilkWithSugar = new Sugar(coffeeWithMilk); // coffeeWithMilk 변수를 sugar로 감싼다. 
        System.out.println(coffeeWithMilkWithSugar.getDescription() + ": $" + coffeeWithMilkWithSugar.cost());

        Beverage coffeeWithCreamWithMilk = new Milk(new Cream(new Coffee()));
        System.out.println(coffeeWithCreamWithMilk.getDescription() + ": $" + coffeeWithCreamWithMilk.cost());
    }
}
