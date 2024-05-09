package chap21;

import java.util.Arrays;

public class ArrayCopy2 {
    public static void main(String[] args) {
        //for loop
        int [] arr = {1,2,3,4,5,6,7,8,9,10};
        
        int [] arr1 = new int [arr.length];

        //방법 1
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = arr[i];
        }
        //방법2
        int[] arr2 = Arrays.copyOf(arr, arr.length);
        //방법3 -> 실수에서 가장 많이 사용
        int[] arr3 = arr.clone();
        
        arr[0] =100;

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
}
