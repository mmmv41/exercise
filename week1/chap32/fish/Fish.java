package chap32.fish;

public class Fish {
    private String sex; // "male", "female"
    protected boolean havingPoison; //true 독있고, false독없고 / protected -> 자식클래스에서 사용가능 
    private String startSpawningDate; //산란 시작기간
    private String endSpawningDate; // 산란 종료 기간
    protected String leavingSea; // 사는 속성

    //행위
    void eat(String food){
        System.out.printf( myInfo() + " 는 %s를 먹고 있습니다.\n",food);
    }

    void swin(int meter){
        System.out.println("나는 헤엄칩니다 미터: " + meter);
    }

    void makeCrowd(Fish otherFish){
        System.out.println("다른 물고기와 무리짓는다.");
    }

    void sleep(){}

    String myInfo(){ //객체의 정보 출력시, 해당 객체의 정보를 문자열로 변환. 다른 메서드에서 활용 가능.
        return String.format("물고기(sex: %s, havingPoison: %b, leavingSea: %s)",
        this.sex, this.havingPoison, this.leavingSea);
        // String.format() 메서드는 문자열 서식을 지정할 수 있어, 객체의 정보를 보기 좋게 출력 가능
        // 이 메서드를 사용하면 객체의 각 필드 값을 적절한 형식으로 문자열에 포함시킬 수 있다.
    }


    void printMyInfo(){ 
        System.out.println(myInfo());
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setHavingPoison(boolean havingPoison) {
        this.havingPoison = havingPoison;
    }

    public void setStartSpawningDate(String startSpawningDate) {
        this.startSpawningDate = startSpawningDate;
    }

    public void setEndSpawningDate(String endSpawningDate) {
        this.endSpawningDate = endSpawningDate;
    }

    public void setLeavingSea(String leavingSea) {
        this.leavingSea = leavingSea;
    }

    Fish(){

    }

    public Fish(String sex, boolean havingPoison, String startSpawningDate, String endSpawningDate, String leavingSea) {
        this.sex = sex;
        this.havingPoison = havingPoison;
        this.startSpawningDate = startSpawningDate;
        this.endSpawningDate = endSpawningDate;
        this.leavingSea = leavingSea;
    }

}
