package week2.chap51;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryMultiCatchTest {
    public static void main(String[] args) {
        try {
            FileInputStream fs = new FileInputStream("exercise/week2/chap51/text.txt");
            int i = 10;
            int data = 100 / i;

            String str = "abc";
            System.out.println(str.toUpperCase());

            int index = 10;
            int[] intArr = new int[10];
            System.out.println(intArr[index]);
            // FileInputStream 은 FileNotFound가 뜨기 때문에 무조건 catch문으로 오류 잡기 !!
        } catch (FileNotFoundException e) {
            System.out.println("File을 찾을 수 없습니다.");
            e.printStackTrace();
        // } catch (ArithmeticException | NullPointerException e){
        //     System.out.println("Arithmetic Exception 또는 NullPointerException이 발생했습니다.");
        //     e.printStackTrace();
        } catch (Exception e){ // 모든 exception이 여기 걸리게 됨
            System.out.println("최종 Exception 필터에 걸렸습니다.");
        }
        System.out.println("메인 메소드 종료");
    }
}
