package chap29;
//시나리오 참고
// 아메리카노는 물 500ml와 원두 30g으로 만들어진다.
// 아메리카노는 테이크 아웃 용으로 만들어진다.
public class Coffee {
    //속성
    private String coffeeName ;
    private long waterQuantity ; // ml 단위
    private long coffeeBeanQuantity; // 원두의 양 g단위
    private boolean isWrappedUP; // 포장됨 여부

    //행위
    void beWrappedUP(){
        this.isWrappedUP = true;
    }

    //생성자 -> 클래스 이름으로 만듦
    Coffee(String coffeeName, long waterQuantity, long coffeeBeanQuantity){
        this.coffeeName = coffeeName;
        this.waterQuantity = waterQuantity;
        this.coffeeBeanQuantity = coffeeBeanQuantity;
        isWrappedUP = false;
    } 

    public String getCoffeeName() { 
        // coffeeName 을 private으로 줬기 떄문에 다른 클래스에서 사용하려면 getter 만들어야함
        return coffeeName;
    }

    public boolean isWrappedUP() {
        return isWrappedUP;
    }
}
