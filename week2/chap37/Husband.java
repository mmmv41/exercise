package week2.chap37;

public interface Husband {
    void takeCareWife (Wife wife);

    default void sayLoveEveryday(){
        System.out.println("우리 아내 사랑합니다.");
    };
    
    String getName();
}
