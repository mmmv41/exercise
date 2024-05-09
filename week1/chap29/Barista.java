package chap29;

// 시나리오 참고
// 1. 바리스타는 아메리카노 주문 확인을 알린다.
// 2. 바리스타는 물 500ml와 원두 30g으로 아메리카노를 만든다
// 3. 바리스타는 커피 완성을 알린다
public class Barista {
    //속성
    

    //행위
    public void noticeOrder(String coffeeName){ // 1. 주문 확인을 알린다
        System.out.println("바리스타 : 커피 주문 확인 됐습니다. 커피: "+ coffeeName);
    }

    public Coffee makeUpCoffee(String coffeeName, long waterQuantity, long coffeeBeanQuantity ){ 
        // 2. 커피를 만든다 / 반환값이 Coffee고 메소드는 makeUpCoffee
        Coffee coffee = new Coffee(coffeeName, waterQuantity, coffeeBeanQuantity);
        return coffee;
    }

    public void sayCoffeeReady(Coffee coffee){ // 3. 커피 완성을 알린다
        String coffeeName = coffee.getCoffeeName();
        System.out.println("바리스타: 커피 제작이 완료되었습니다. 커피: " + coffeeName);
    }
}
