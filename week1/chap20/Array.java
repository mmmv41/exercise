package chap20;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int [] studentScores = {83, 90, 87, 93, 78};
        studentScores[1] = 95;
        System.out.println(Arrays.toString(studentScores));
        // String res = Arrays.toString(studentScores);
        // System.out.println(res);
    }
}
