package week3.chap63;

class Counter {

    private int count = 0; // 이 필드를 공통으로 접근 하므로 

    public synchronized void increment() { // count를 수정하는 메소드인 increment() 메소드에 임계영역 설정
        count++; // count 값 1씩 증가 
    }

    public int getCount() {
        return count; // 현재 카운트 값 조회
    }
 }
