package chap20;

public class ArrayFor {
    public static void main(String[] args) {
        int [] studentScroes = {90,87,88,75,99,65};

        //for loop
        for (int i = 0; i < studentScroes.length; i++) {
            System.out.printf("이 Array의 %d 인덱스 값은 %d이다. \n",i,studentScroes[i]);
            
        }
        // 강화된 for loop
        for (int score : studentScroes) {
            System.out.printf("students의 값은 %d 이다. \n", score);
        }
    }
}
