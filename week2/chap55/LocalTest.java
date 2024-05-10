package week2.chap55;

public class LocalTest {
    public static void main(String[] args) {
        //지역 내부 클래스 
        class LocalWalk implements Walkable {

            @Override
            public void walk() {
                System.out.println("LocalWalk: Walking ");
            }

        }
        LocalWalk localWalk = new LocalWalk();
        localWalk.walk();

        int i = 100;

        //익명 클래스 -> 한번만 사용하는 클래스이자 인스턴스
        Walkable annoymousWalk = new Walkable() {

            @Override
            public void walk() {
                // i = 200; -> 접근은 가능하지만 수정은 불가능하다. 
                System.out.println(i);
                System.out.println("AnnoymousWalk: Walking ");
            }
        };
        annoymousWalk.walk();
    }
    // public static void test(){
    //     LocalWalk -> 바로 오류 뜸 . 메소드 안에서만 사용 가능하기 때문에 여기서 접근 불가. 
    // }

}
