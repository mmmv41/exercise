package chap29;

// 손님 현금 : 5만원
// 매상 : 100만원
public class CoffeeShop {
    public static void main(String[] args) {
        // 인스턴스화
        Customer customer = new Customer();
        customer.setCashAmount(50_000);

        Cashier cashier = new Cashier();
        cashier.setSalesAmount(1_000_000);

        Barista barista = new Barista();

        //로직 시작
        String coffeeName = "아메리카노";
        boolean isTakeOut = true;

        customer.askCoffee(cashier,coffeeName);
        // 1.손님은 캐셔에게 커피가 얼마인지 묻는다.

        long price = cashier.checkCoffeePrice(coffeeName);
        cashier.replyCoffeePrice(coffeeName, price);
        //2. 캐셔는 아메리카노가 얼마인지 확인한 후, 가격 답변해준다

        long cash = customer.withDrawCash(price);
        customer.orderCoffee(coffeeName, isTakeOut);
        // 3. 손님은 자신의 현금에서 돈을 빼서 아메리카노를 테이크 아웃으로 주문.

        cashier.addMount(cash);
        cashier.sayOrder(coffeeName);
        // 4. 캐셔는 자신의 매상에 돈을 더하고, 아메리카노 주문을 알린다.

        barista.noticeOrder(coffeeName);
        // 5. 바리스타는 아메리카노 주문 확인을 알린다.

        Coffee coffee = barista.makeUpCoffee(coffeeName, 500, 30);
        // 6. 바리스타는 물 500ml와 원두 30g으로 아메리카노를 만든다

        barista.sayCoffeeReady(coffee); // coffee -> 주문 받아서 만드는 커피
        // 7. 바리스타는 아메리카노 완성을 알린다

        Coffee coffeeCompleted = cashier.wrapOfCoffee(coffee);
        // 8. 캐셔는 아메리카노 커피를 테이크아웃 용으로 포장한다 

        cashier.sayOrder(coffeeName);
        // 9. 캐셔는 아메리카노 준비완료를 말한다.

        customer.drinkCoffee(coffeeCompleted); //coffeeCompleted -> 손님이 받아서 마시는 커피
        if(coffeeCompleted.getCoffeeName() == coffeeName && 
            coffeeCompleted.isWrappedUP() == isTakeOut){
            customer.upgradeMyFeeling();
        }
        customer.showMyInfo();
    }   
}
