package week2.chap50;

public class TryCatch {
    public static void main(String[] args) {
        System.out.println("메인 메소드 시작");

        try {
            int i = 10;
            int data = 50 / i;
            System.out.println("data: " + data);
    
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다.");
            System.out.println("data:" + 0);
            e.printStackTrace();
        }

        System.out.println("메인 메소드 종료");
    }
}
