package chap17;

public class WhileLoop {
    public static void main(String[] args) {
        // 1~10까지 더하는 while loop
        int sum = 0;
        int num = 0;

        while(num < 10){
            num = num +1;
            sum = sum +num;
        }
        String result = String.format("전체 합은 %d입니다.",sum );
        System.out.println(result);
    }
}

