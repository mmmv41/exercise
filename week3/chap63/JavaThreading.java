package week3.chap63;

public class JavaThreading {
    public static void main(String[] args) {
        //thread 실행
        // 1. thread1 정의 . MyRunnable 클래스를 만들고 실행 
        Thread thread1 = new Thread(new MyRunnable()); // Runnable을 넣어줘야함 

        // 익명 클래스 
        Thread thread2 = new Thread(new Runnable() {

            @Override
            public void run() {
                System.out.println("Thread " + Thread.currentThread().getName() + " 실행하고 있습니다.");
            }
            
        });

        // 람다식 
        Thread thread3 = new Thread( () -> System.out.println("Thread " + Thread.currentThread().getName() + " 실행하고 있습니다."));

        System.out.println("Thread " + Thread.currentThread().getName() + " 실행하고 있습니다.");

        // 2. start를 하면 run()을 실행 
        thread1.start(); // 쓰레드 실행 방법 
        thread2.start();
        thread3.start();


        System.out.println("Thread " + Thread.currentThread().getName() + " 실행하고 있습니다.");
        // 메인 메소드안에서는 무조건 main thread가 실행된다.
    }

    static class MyRunnable implements Runnable{ // Runnable 정의 

        @Override
        public void run() {
            System.out.println("Thread " + Thread.currentThread().getName() + " 실행하고 있습니다.");
            // 3. 실행하고 있는 쓰레드 네임을 가져옴 
        }

    }
}
