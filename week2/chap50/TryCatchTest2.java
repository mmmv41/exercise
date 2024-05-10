package week2.chap50;

import java.util.ArrayList;
import java.util.List;

public class TryCatchTest2 {
    public static void main(String[] args) {
        
        System.out.println("메인 메소드 실행");

        List<String> stringlist = new ArrayList<>();

        stringlist.add("hello");
        stringlist.add("world");
        stringlist.add(null);
        stringlist.add("bye");

        for (int i = 0; i < stringlist.size(); i++) {
            try {
                System.out.println("i: " + 1);
                String str = stringlist.get(i);
                System.out.println(str.toUpperCase());

            // } catch (NullPointerException e) { // 클래스가 아닌 변수로 인식돼서 오류뜨는듯 ... 
            //     System.out.println("null은 ");
            } catch (ArrayIndexOutOfBoundsException e){
                System.out.println("ArrayBoundException 입니다.");
                break;
            }
        }
        System.out.println("메인 메소드 종료");
    }
}
