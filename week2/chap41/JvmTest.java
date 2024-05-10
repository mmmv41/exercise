package week2.chap41;

// 자바 런타임 때 일어나는 일 
public class JvmTest {
    public static void main(String[] args) {
        //시작
        int myInt = 5;
        final long MY_LONG = 5L;
        Customer customer = new Customer("mark");
        int[] intArr = new int[5];
        String str1 = "Hello World";
        String str2 = new String("Hello World");
        customer = null;

        myMethod(myInt);

    }

    static void myMethod(int param) {
        int myInt2 = param;
        Customer customer2 = new Customer("may");
    }
}
