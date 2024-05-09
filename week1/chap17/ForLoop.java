package chap17;

public class ForLoop {
    public static void main(String[] args) {
        //1~10 까지 다 더하기 for-loop 이용
        int sum = 0;

        for (int num = 0; num <=10; num++) {
            sum += num;
        }
        System.out.printf("전체 합은 : %d",sum);
    }
}
