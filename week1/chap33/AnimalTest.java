package chap33;

public class AnimalTest {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal animal2 = new Bird(); //upcasting
        Animal animal3 = new Fish(); //upcasting

        feed(animal, "빼빼로"); //animal 클래스의 eat 메소드 실행
        feed(animal2, "벌레" ); // bird 클래스
        feed(animal3, "모이"); // fish 클래스 
    }

    public static void feed(Animal animal, String food){ // 먹는다는걸 출력하는 함수 만들기
        animal.eat(food); // animal이 들어오면 eat 을 실행
    }
}
