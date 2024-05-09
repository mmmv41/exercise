package chap25;

public class Fish {
    String sex; // "male", "female"
    boolean havingPoison; //true 독있고, false독없고
    String startSpawningDate; //산란 시작기간
    String endSpawningDate; // 산란 종료 기간
    String leavingSea; // 사는 속성

    //행위
    void eat(String food){
        System.out.printf("물고기는 %s를 먹고 있습니다.\n",food);
    }

    void swin(int meter){
        System.out.println("나는 헤엄칩니다 미터: " + meter);
    }

    void makeCrowd(Fish otherFish){
        System.out.println("다른 물고기와 무리짓는다.");
    }

    void sleep(){}
}
