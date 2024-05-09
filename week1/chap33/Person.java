package chap33;

public class Person extends Animal {
    private String name;
    private String job;
    private int height;

    @Override
    public void eat(String food){
        System.out.println("사람이 음식을 젓가락으로 먹는다.\n");
    }

    @Override 
    public void sleep(){
        System.out.println("사람이 자고 있습니다.\n");
    }

    public void walk(){
        System.out.println("사람이 걷고 있습니다.\n");
    }
}
