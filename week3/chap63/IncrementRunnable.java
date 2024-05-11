package week3.chap63;

class IncrementRunnable implements Runnable{ // 스레드로 실행하기 떄문에 Runnable을 implement

    private Counter counter; // counter를 필드에 넣을것 

    public IncrementRunnable(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {

            try {
                Thread.sleep(1); // Thread.sleep() : 실행하기전 잠깐 멈췄다 실행한다. -> 누락시키기 위해 의도적으로 사용했음
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            counter.increment(); // 천번을 돌면서 counter의 increment메소드 실행.
            System.out.println("Count: " + counter.getCount()); // 하나씩 늘리고 출력 
        }
    }
    
}
