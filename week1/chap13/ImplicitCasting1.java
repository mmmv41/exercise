package chap13;

public class ImplicitCasting1 {
    public static void main(String[] args) {
        // 덜 정밀한 자료형 -> 더 정밀한 자료형 
    int myInt = 5;
    float myFloat = myInt; //myInt가 int타입에서 float타입으로 자동형변환
    System.out.println(myInt); 
    }
}

