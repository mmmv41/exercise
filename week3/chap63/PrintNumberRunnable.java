package week3.chap63;

// 멀티쓰레딩 할것임 -> implements Runnable 무조건 해줘야함 !
public class PrintNumberRunnable implements Runnable{

    int start; // 시작 과 끝을 속성으로 가짐
    int end;

    public PrintNumberRunnable(int start, int end) { // 생성자 정의
        this.start = start;
        this.end = end;
    }


    @Override
    public void run() {
        for (int i = start; i <= end; i++) {
            System.out.print( i + " ");
        }
    }
    
}
