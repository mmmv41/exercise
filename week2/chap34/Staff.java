package week2.chap34;

public class Staff {
    //속성
    private int salesAmount; // 매상 

    //행위
    public int helpPayment(Customer customer, int price){
        return customer.calculatePrice(price); // 1. 손님의 요청을 결제한다. 
        // 돈을 얼마를 내는지는 스스로 결정 
    }

    // public int helpPayment(VIPCustomer customer, int price){
    //     return customer.calculatePrice(price);
    // }

    public void addSalesAmouny(int cash){
        salesAmount += cash; // 2. 매상에 돈을 더한다.
    }

    public void printMySalesAmount(){
        System.out.println("오늘의 최종 매상은 " + this.salesAmount + "원 입니다.");
        // 3. 최종 매상 출력한다. 
    }

    public void setSalesAmount(int salesAmount) {
        this.salesAmount = salesAmount;
    }

}
