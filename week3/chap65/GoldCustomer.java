package week3.chap65;

public class GoldCustomer extends Customer {

    double discountRatio;

    public GoldCustomer(String name) {
        this.customerID = "Customer" + Customer.serialNum++;
        this.customerName = name;
        this.customerGrade = "GOLD";
        this.bonusPoint = 0;
        this.bonusRatio = 0.03;
        this.discountRatio = 0.03;
    }

    @Override
    @Deprecated // 이 메소드는 곧 없앨것이라고 알려줌. 
    public int calculatePrice(int price) {
        price -= price * discountRatio;
        this.bonusPoint += price * bonusRatio;
        return price;
    }
}
