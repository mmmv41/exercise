package chap32.fish;

public class FishChild extends Fish{
    private boolean eatable;
    protected String leavingSeachild;

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

    void printSea(){
        System.out.println(myInfo() + "는 " + this.leavingSeachild + " 바다 출신이고, " +
        "부모 물고기는 " + super.leavingSea + " 바다 출신이야."); 
    } // 1. myInfo() 를 찾아 밑으로 내려감

    // @Override
    // String myInfo() { // 2. super.myInfo를 찾으러감 
    //     // TODO Auto-generated method stub
    //     return super.myInfo() + " 는 부모 물고기, " 
    //     + String.format("자식 물고기(eatable = %b, leavingSea = %s",this.eatable,this.leavingSeachild);
    // } // override로 기존 myInfo를 재정의 함. super로 기존 myInfo는 살리면서 덧붙임

    public void setLeavingSeachild(String leavingSeachild) {
        this.leavingSeachild = leavingSeachild;
    }

    FishChild(){
        //super(); 자동으로 추가됨. -> 부모 클래스의 빈 생성자 Fish() 출력 
        super(); // 부모 물고기가 만들어지고 있습니다.  
        // System.out.println("자식 물고기가 생성되고 있습니다.");
    }

    FishChild(String sex, boolean eatable, String leavingSea){ // 부모클래스의 속성 사용시 
        //super(); 먼저 불러줘야함 / super()로 호출하면 Fish()가 호출됨
        super(sex,false,"2022","2022",leavingSea);
        this.eatable = eatable; 
    }

    public FishChild(boolean eatable, String leavingSea) { // 생성자 
        // this.leavingSea = leavingSea 을 하면 자식클래스의 eatable 만 변경됨
        this.eatable = eatable; 
        super.leavingSea = leavingSea;
        // this대신 super을 붙임 -> 부모의 변수를 바꾸는것이였다고 알려줘야함 
    }

}
