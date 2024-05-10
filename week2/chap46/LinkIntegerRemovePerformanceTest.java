package week2.chap46;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkIntegerRemovePerformanceTest {
    static final int size = 100000;

    public static void main(String[] args) {

        long startTime;
        long endTime;

        startTime = System.currentTimeMillis();

        // List ArrayList 구현
        List<Integer> integerList1 = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            integerList1.add(i);
            if (i % 5 ==0){
                integerList1.remove(0); // 5의 배수 마다 첫번째 숫자를 뺌 
            }
        }

        endTime = System.currentTimeMillis();

        System.out.println("ArrayList 삽입/삭제 요청 걸린시간: " + (endTime - startTime) + "ms"); // 1000분의 1초

        ///////////////////////

        startTime = System.currentTimeMillis();
        // List LinkedList 구현
        List<Integer> integerList2 = new LinkedList<>();

        for (int i = 0; i < size; i++) {
            integerList2.add(i);
            if(i % 5 ==0){
                integerList2.remove(0);
            }
        }

        endTime = System.currentTimeMillis();

        System.out.println("LinkedList 삽입/삭제 요청 걸린시간: " + (endTime - startTime) + "ms"); // 1000분의 1초

        // System.out.println(integerList1);
        // System.out.println(integerList2);
    }
}
