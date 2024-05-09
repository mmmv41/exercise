package chap12;

public class Operator2 {
    public static void main(String[] args) {
        // 관계 연산자
        int num1 = 10;
        int num2 = 20;
        boolean result = num1 > num2;
        System.out.println(result); // 결과 false 

        String str1 = "abc";
        String str2 = "abc";
        boolean result2 = str1 == str2;
        System.out.println(result2); //결과 true

        // 논리 연산자
        boolean condition1 = 5>3;
        boolean condition2 = 4>=4;
        boolean result3 = condition1 && condition2; // 결과 true
        System.out.println(result3);

    }
}
