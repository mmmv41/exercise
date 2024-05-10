package week2.chap36;

public interface Flyable {
    
    //속성
    long atmosphereLimit = 476;
    // static final long atmosphere = 476 인데 숨겨져있는것.

    default void fly(){ // defalut 메소드 -> 구현 클래스에서 정의 가능 
        System.out.println("<정보> 현재 이 사물은 날고 있습니다.");
    };

    static void printLanding(){
        System.out.println("<정보> 현재 이 사물은 공중에 있습니다.");
    }
}
