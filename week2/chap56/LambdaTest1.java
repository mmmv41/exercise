package week2.chap56;

public class LambdaTest1 {
    public static void main(String[] args) {
        MultipleNum multipleNum1 = (x) -> x * 1; 
        MultipleNum multipleNum2 = (i) -> i * 2;
        MultipleNum multipleNum3 = (x) -> {return x * 3;};
        MultipleNum multipleNum4 = (int myInt) -> {return myInt * 4;};

        System.out.println(multipleNum1.calculate(5));
        System.out.println(multipleNum2.calculate(5));
        System.out.println(multipleNum3.calculate(5));
        System.out.println(multipleNum4.calculate(5));
        
        StringNum stringnum1 = (x,y) -> System.out.println("stringnum1: " + x);
        StringNum stringnum2 = (x,y) -> {
            for (int i = 0; i < y; i++) {
                System.out.println("stringnum2: " + x);
            }
        };
        StringNum stringnum3 = (x,y) -> {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < y; i++) {
                sb.append(x); // hello들을 붙여줌 
            }
            System.out.println("stringnum3: " + sb.toString());
        };

        stringnum1.printString("Hello",5);
        stringnum2.printString("Hello",5);
        stringnum3.printString("Hello",5);
    }
}
