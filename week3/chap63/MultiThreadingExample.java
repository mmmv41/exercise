package week3.chap63;

public class MultiThreadingExample {
    public static void main(String[] args) {
        // Q. 1~100 까지 출력, multi threading으로 분담해서

        // 2명 thread
        Thread thread1 = new Thread(new PrintNumberRunnable(1,50));
        Thread thread2 = new Thread(new PrintNumberRunnable(51, 100));

        thread1.start(); // 필수 !! 안적으면 쓰레드 실행 안됨
        thread2.start();
    }

    
}
