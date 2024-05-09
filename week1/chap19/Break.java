package chap19;

public class Break {
    public static void main(String[] args) {
        int sum =0;

        for (int i = 1; i <=100; i++) {
            if(i==5){
                break; // i가 5면 for문 탈출. 1+2+3+4 = 10 
            }
            sum += i;
        }
        System.out.print("총합은 " + sum);
    }
}
