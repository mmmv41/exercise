package week2.chap51;

public class TryCatchFinally {
    public static void main(String[] args) {
        System.out.println("메인 메소드 시작");
   
        try {
            Integer myInt = null;
            Integer data = 100 / myInt;

            System.out.println("data: " + data);
        } catch (ArithmeticException e) {
            System.out.println("Myint는 0이 될 수 없습니다.");
            e.printStackTrace();

        } finally {  // 무조건 실행됨
            System.out.println("여기는 무조건 실행되는 finally 영역입니다.");
        }

        System.out.println("메인 메소드 종료");
    }
}
