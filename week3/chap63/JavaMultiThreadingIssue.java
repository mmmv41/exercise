package week3.chap63;

public class JavaMultiThreadingIssue {
    public static void main(String[] args) {
        Counter counter = new Counter(); // 스레드가 counter라는 객체를 공통적으로 공유하고 있다. 

        Thread thread1 = new Thread(new IncrementRunnable(counter));
        Thread thread2 = new Thread(new IncrementRunnable(counter));
        Thread thread3 = new Thread(new IncrementRunnable(counter));

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
