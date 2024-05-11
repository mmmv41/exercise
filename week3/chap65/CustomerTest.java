package week3.chap65;

import week3.chap65.GoldCustomer;

public class CustomerTest {

    public static void main(String[] args){
        GoldCustomer customer = new GoldCustomer("이순신");

        long price = customer.calculatePrice(100); // @deprecated 사용했기 때문 
        System.out.println("price: " + price);
    }
}
