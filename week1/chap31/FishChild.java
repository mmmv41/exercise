package chap31;

public class FishChild extends Fish{
    private boolean eatable;


    // 새로운 메소드
    public void digging() {
        System.out.println(myInfo() + "가 모래를 파고 있습니다.");
    }

    public boolean isEatable() { //getter생성시 boolean 값은 get으로 시작x , is로 시작.
        return eatable;
    }

    public void setEatable(boolean eatable) {
        this.eatable = eatable;
    }

    public void becomeDanger(){
        this.havingPoison = true;
    }

    @Override // 부모클래스에 있는건데 재수정 할거다. 라고 컴퓨터에게 알림
    void eat(String food){
        System.out.printf( myInfo() + " 는 %s를 열심히 먹고 있습니다.\n",food);
    }
}
