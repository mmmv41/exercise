package week3.chap64.singleton;

public class FileWriterExampleTest {
    public static void main(String[] args) {
        Thread thread1 = new Thread( () -> { 
            // Runnable로 정의돼있어야하는데 Runnable은 FunctionInterface 이므로 람다로 구현
            FileWriterExample writer = new FileWriterExample("exercise/week3/chap64/text.txt");
            // text.txt에 실행됨
            writer.writeToFile("Thread 1: Message 1");
            writer.writeToFile("Thread 1: Message 2");

        });

        Thread thread2 = new Thread( () -> {
            FileWriterExample writer = new FileWriterExample("exercise/week3/chap64/text.txt");
            writer.writeToFile("Thread 2: Message 3");
            writer.writeToFile("Thread 2: Message 4"); 
        });
        // 두개의 스레드가 동시에 같은 파일을 바라보고 적는다. 
        // 스레드가 끝나면 jarbage collector 가 회수함. (더이상 쓰이지않기 때문) -> 반복적. 불필요하다 -> 싱글톤으로 개선 
    
        thread1.start();
        thread2.start();
    }
}
