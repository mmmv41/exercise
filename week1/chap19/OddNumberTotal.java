package chap19;

public class OddNumberTotal {
    public static void main(String[] args) {
        int total = 0;
        
        for (int i = 1; i <= 100; i++) {
            if(i%2==0){
                continue; // 짝수는 실행되지 않고 다시 올라감 
            }
            total += i; // 홀수만 더하게 됨
        }
        System.out.println("홀수의 총합은 " + total);
    }
}
