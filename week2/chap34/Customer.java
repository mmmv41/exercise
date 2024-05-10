package week2.chap34;

public class Customer {
    // 속성
    static int serialNum = 1; // 순차적으로 올라갈때는 추적할수있는값을 static으로. 클래스에 종속하도록.
    
    protected String customerID; // 고객 id
    protected String name; // 고객 이름
    protected String customerGrade; // 고객 등급

    protected int bonusPoint; // 보너스 포인트
    protected double bonusPointRatio; // 포인트 적립 비율 


    // 행위
    public int calculatePrice(int price){
        this.bonusPoint += price * bonusPointRatio;
        return price;
    }

    Customer(){
        
    }

    Customer(String name) {
        this.customerID = "Customer" + serialNum++;
        this.name = name;
        this.customerGrade = "Silver";
        this.bonusPointRatio = 0.01;
        this.bonusPoint = 0;
    }

    void printMyInfo(){
        System.out.printf("Customer(customerID=%s, name=%s, customerGrade=%s, bonusPoint=%d)\n",
        this.customerID,this.name, this.customerGrade,this.bonusPoint);
    }

}
