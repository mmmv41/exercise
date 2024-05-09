package chap20;

import java.util.Arrays;

public class ArrayDeclaration {
    public static void main(String[] args) {
        //int []
        int [] intArr = new int [10];
        int [] intArr2 = new int [] {1,2,3,4,5}; //array 선언과 동시에 어떤 값이 들어갈지 정의 
        int [] intArr3 = {1,2,3,4,5}; // 위의 코드와 같은 결과 값 

        System.out.println(intArr); // array는 메모리값을 출력한다 
        System.out.println(Arrays.toString(intArr)); // 선언한 동시에 초기화하지 x. 기본값이 출력 
        System.out.println(Arrays.toString(intArr2));
        // Arrays.toString을 붙여 배열 출력 
    }
}
