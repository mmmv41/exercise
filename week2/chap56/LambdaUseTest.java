package week2.chap56;

public class LambdaUseTest {
    public static void main(String[] args) {
        MultipleNum multipleNum = (num) -> num *10; // 1. 선언

        printNum(multipleNum); // 2. multipleNum이 인자로 들어간 printNum 실행 

        printNum( (x) -> x*100); // 생략하여 실행 가능 

        GenericLambda<String> genericLambda = (str) -> str.toUpperCase();
        GenericLambda<Integer> genericLambda2 = (num) -> num * 2;
        GenericLambda<Boolean> genericLambda3 = (myBool) -> myBool & true;

        System.out.println(genericLambda.calculate("ABC"));
        System.out.println(genericLambda2.calculate(100));
        System.out.println(genericLambda3.calculate(true));

    }
    static void printNum(MultipleNum multipleNum){
        int result = multipleNum.calculate(5); // 3. multipleNum이 calculate 실행 

        System.out.println(result);
    }
}
