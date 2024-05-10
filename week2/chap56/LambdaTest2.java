package week2.chap56;

public class LambdaTest2 {
    public static void main(String[] args) {
        MultipleNum multipleNum = new MultipleNum() {

            @Override
            public int calculate(int num) {
                return num * 1;
            }
            
        };
    }
}
