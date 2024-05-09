package chap29;

//시나리오 참고
// 1. 손님은 캐셔에게 아메리카노 가격 물어본다
// 2. 손님은 자신의 현금 에서 돈을 뺀다.
// 3. 손님은 아메리카노를 테이크아웃으로 주문한다 
// 4. 손님은 커피를 마신다.
// 5. 손님은 기분이 좋아진다
public class Customer {
    //속성
    private long cashAmount; // 손님이 가진 돈 
    private String myFelling;

    //행위
    public void askCoffee(Cashier cashier, String coffeeName){
        System.out.println("손님: 커피 " + coffeeName + "얼마인가요?");
    }

    public long withDrawCash(long amount){
        this.cashAmount -= amount; // this.cashAmount : 결제하고 남은 손님의 돈 
        return amount;
    }

    public void orderCoffee(String coffeeName, boolean isWrappedUP){
        System.out.println("손님: 커피"+ coffeeName + " 을 주문할게요" + 
        "단, 포장여부는" + isWrappedUP + " 으로 부탁드려요. " );
    }

    public void drinkCoffee(Coffee coffee){
        String coffeeName = coffee.getCoffeeName();
        System.out.println("손님: 나는 커피 "+ coffeeName + "을 마신다.");
    }

    public void upgradeMyFeeling(){
        this.myFelling = "기분이 좋아졌다.";
    }

    public void showMyInfo(){
        System.out.printf("손님: 지금 나의 기분은 %s하고, 현금은 %d 있습니다.",this.myFelling, this.cashAmount);
    }

    public void setCashAmount(long cashAmount) {
        this.cashAmount = cashAmount;
    }
}
