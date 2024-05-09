package chap12;

public class Operator1 {
    public static void main(String[] args) {
        // 대입 연산자
        int a =10;
        int b = a;
        int c = b;
        System.out.println(c); // 결과 : 10

        // 부호 연산자
        int positive3 = 3;
        int negative3 = -3;
        System.out.println(positive3); // 결과 : 3 
        System.out.println(negative3); // 결과 : -3

        // 산술 연산자
        int num1 = 10;
        int num2 = 5;
        int num3 = 4;
        int result = (num1 + num2) % num3 ; // 결과 : 3
        System.out.println(result);

    }
}
