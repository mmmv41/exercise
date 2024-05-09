package chap21;

import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args) {
        int a= 5;
        int b= a;
        a += 10;

        System.out.println(a);
        System.out.println(b);

        //array
        int [] arr1 = {1,2,3,4};
        int [] arr2 = arr1;

        arr1[0] = 10;

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
}
