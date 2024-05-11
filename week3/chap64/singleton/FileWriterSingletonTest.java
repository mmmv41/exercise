package week3.chap64.singleton;

public class FileWriterSingletonTest {
    
    public static void main(String[] args) {
        Thread thread1 = new Thread( () -> { 
            // Runnable로 정의돼있어야하는데 Runnable은 FunctionInterface 이므로 람다로 구현
            FileWriterSingleton writer = FileWriterSingleton.getInstance();
            // text.txt에 실행됨
            writer.writeToFile("Thread 1: Message 1");
            writer.writeToFile("Thread 1: Message 2");

            // JVM GC 회수 x -> getinstance는 계속 사용되는걸 알기 때문에 회수하지 x
        });

        Thread thread2 = new Thread( () -> {
            FileWriterSingleton writer = FileWriterSingleton.getInstance();
            writer.writeToFile("Thread 2: Message 3");
            writer.writeToFile("Thread 2: Message 4"); 
        });
        // 두개의 스레드가 동시에 같은 파일을 바라보고 적는다. 
        // 스레드가 끝나면 jarbage collector 가 회수함. (더이상 쓰이지않기 때문) -> 반복적. 불필요하다 -> 싱글톤으로 개선 
    
        thread1.start();
        thread2.start();

        // FileWriterSingleton.getInstance().closeFile(); -> join 해주어야함.
    }
}
