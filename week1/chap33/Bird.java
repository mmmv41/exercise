package chap33;

public class Bird extends Animal{
    //속성
    private long weight;
    private String color;

    //행위
    @Override // 부모 클래스의 메소드를 재정의 하겠다.
    public void eat(String food){
        System.out.printf("새가 %s 을 부리로 쪼아 먹고 있습니다.\n", food);
    }

    @Override
    public void sleep(){
        System.out.println("새가 잠을 자고 있습니다.\n");
    }

    public void fly(){
        System.out.println("새가 날고 있습니다.\n");
    }
}
