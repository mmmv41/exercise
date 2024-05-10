package week2.chap50;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionTest {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("메인 메소드 시작");
        makeCheckedException();
        System.out.println("메인 메소드 종료");
    }

    public static void makeUncheckedException(){
        int[] intArr = {1,2,3,4,5,6,7,8,9,10};
        int index = 10;

        System.out.println("값: " + intArr[index]);
    }

    public static void makeCheckedException() throws FileNotFoundException{
        File file = new File("/Users/sinmingyeong/Desktop/helloworld/exercise/week2/chap50/text.txt");
        FileInputStream fs = new FileInputStream(file);

        System.out.println("fs 실행");
    }   
}
