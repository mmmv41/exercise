package week2.chap35;

public class Dog extends Animal{ // 구체클래스 -> 추상메서드 구현 

    @Override
    public void eat(String food) {
        System.out.printf("개는 %s을 단단한 이빨로 씹어먹습니다.\n",food);
    }

    @Override
    public void sleep() {
        System.out.println("개는 잠을 잡니다.");
    }
    
}
