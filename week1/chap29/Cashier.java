package chap29;

//시나리오 참고
// 1. 캐시어는 아메리카노가 얼마인지 확인
// 2. 아메리카노 가격 답변
// 3. 자신의 매상에 돈을 더함
// 4. 아메리카노 주문을 알림
// 5. 아메리카노 커피 포장 
// 6. 아메리카노 준비완료 알림

//가격표
// 아메리카노 : 5천원 , 카페라떼 : 6천원, 카페모카 : 6500원, 카푸치노 : 6천원
public class Cashier {
    //속성
    private long salesAmount; //매상

    //행위
    public long checkCoffeePrice(String coffeeName){ // 1. 아메리카노 얼마인지 확인
        long price;
        switch (coffeeName) {
            case "아메리카노":
                price = 5000;
                break;
        
            case "카페라떼":
                price = 6000;
                break;
            
            case "카페모카":
                price = 6500;
                break;

            case "카푸치노":
                price = 6000;
                break;
            
            default:
                price = 0;
                break;
        }
        return price;
    }

    public void replyCoffeePrice(String coffeeName, long price){ //2. 커피 얼마인지
        if (price == 0){
            System.out.println("캐시어: 죄송합니다 손님. 말씀하신 메뉴: " + coffeeName + "는 저희 가게에 없습니다.");
        }
        System.out.println("캐시어: 말씀하신 커피 " + coffeeName + "은 " + price + "원 입니다.");
    }

    public void addMount(long money){ //3. 돈 더하기
        this.salesAmount += money;
    }

    public void sayOrder(String coffeeName){// 4. 주문 알리기 
        System.out.println("캐시어: 커피 "+ coffeeName + "주문이 들어왔습니다.");
    }

    public Coffee wrapOfCoffee(Coffee coffee){ //5. 커피 포장 알리기 . Coffee 클래스에서 구현해둠
        coffee.beWrappedUP();
        return coffee;
    }

    public void sayReady(Coffee coffee){
        String coffeeName = coffee.getCoffeeName();
        System.out.println("캐시어: 주문하신 커피: "+coffeeName+ "가 준비완료 되었습니다.");
    }

    public void setSalesAmount(long salesAmount) {
        this.salesAmount = salesAmount;
    }
    
}
