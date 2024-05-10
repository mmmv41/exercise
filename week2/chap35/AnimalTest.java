package week2.chap35;

public class AnimalTest {
    public static void main(String[] args) {
        // Animal animal = new Animal(); -> 추상클래스는 인스턴스화 불가
        Animal animal2 = new Bird(); //upcasting
        Animal animal3 = new Fish(); //upcasting
        Animal aniimal4 = new Person();
        Animal animal5 = new Dog();

        // feed(animal, "빼빼로"); //animal 클래스의 eat 메소드 실행
        feed(animal2, "벌레" ); // bird 클래스
        feed(animal3, "모이"); // fish 클래스 
        feed(aniimal4, "김밥");
        feed(animal5, "고기");
    }

    public static void feed(Animal animal, String food){ // 먹는다는걸 출력하는 함수 만들기
        animal.eat(food); // animal이 들어오면 eat 을 실행
    }
}
