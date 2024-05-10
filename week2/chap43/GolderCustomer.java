package week2.chap43;

public class GolderCustomer extends Customer{
   private double discountRatio;
   
   @Override
    public int calculatePrice(int price){
        this.bonusPoint += price + bonusPoint;
        price -= price * discountRatio;
        return price;
    }

    GolderCustomer(String name){
        super();
        this.customerID = "Customer" + Customer.serialNum ++;
        this.name = name;
        this.customerGrade = "GOLD";
        this.bonusPoint = 0;
        this.discountRatio = 0.03;
    }
}
