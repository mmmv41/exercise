package week2.chap35;

public abstract class Animal {
    // 속성
    protected String gender;

    //행위
    public abstract void eat(String food); // 추상메서드는 선언만 o, 구현은 구체클래스에서.
    public abstract void sleep();
}
