package week2.chap37;

public interface Daddy {
    void educateBaby(Baby baby);

    default void sayLoveEveryday(){
        System.out.println("우리 아기 사랑합니다.");
    };
}
