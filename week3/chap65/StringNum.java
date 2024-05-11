package week3.chap65;

@FunctionalInterface 
// 없어도 동작함. 쓰는 이유 : 함수형 인터페이스라는걸 명시하기 위해, 요구사항이 충족 x-> 개발자에게 오류가 났다는걸 알려주기 위해 
public interface StringNum {

    void printString(String s);
    // @FunctionalInterface 이기 때문에 하나의 메소드만 있어야한다. 라는 걸 알려줌 
    
    //void printNum(int num); -> 쓰면 빨간줄 뜸 
}
