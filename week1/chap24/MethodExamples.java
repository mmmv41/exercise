package chap24;

public class MethodExamples {
    // 입력값, 출력값 있는경우

    static int toUnicode(char ch){
        return (int) ch; //char ch의 값을 int 으로 변환
    }
    
    //파라 미터 여러개
    static int sumAndMultiplyFour(int a, int b){
        return (a + b) * 4;
    }

    public static void main(String[] args) {
        char ch = 'A'; // 'A' 를 대입
        int decode = toUnicode(ch); // toUniCode('A')를 decode로 줌 
        System.out.println(decode); // A의 int 값 출력 = 65

        int myInt1 = 10;
        int myInt2 = 5;
        int result = sumAndMultiplyFour(myInt1, myInt2);
        // myInt로 안주고 sunAndMultiplyFour(5,10) 이런식으로 해도 실행 가능 
        System.out.println(result);

        String res = sayHello();
        System.out.println(res);

        printHello("printHello");
        printHi();

    }
    // 인자값은 없지만, 출력값은 있는 경우
    static String sayHello(){
        return "Hello";
    }

    //인자값은 있는데, 출력값은 없는 경우
    static void printHello(String str){
        System.out.printf("함수 안에서 실행. %s\n" , str);
    }

    //인자값, 출력값 둘다 없는 경우
    static void printHi(){
        System.out.println("인자값 출력값 둘다 없음 ");
    }
}
