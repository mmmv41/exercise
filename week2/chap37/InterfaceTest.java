package week2.chap37;

public class InterfaceTest {
    public static void main(String[] args) {
        //male 3개 . 남편, 아빠, 회사원

        Husband male = new Male("mark"); // 같은 객체로 계속이어감. 타입만 변경할 것
        Wife wife = new Female("annie");
        
        male.sayLoveEveryday();
        male.takeCareWife(wife);

        // 이어서 아빠
        Daddy maleDaddy = (Daddy) male; // Husband 타입의 male 변수를 Daddy 타입으로 강제 캐스팅.
        Baby baby = new Baby("alice");

        maleDaddy.educateBaby(baby);
        maleDaddy.sayLoveEveryday();

        // 회사원
        Employee maleEmployee = (Employee) maleDaddy;
        Employee femaleEmployee = new Female("chae");

        maleEmployee.workTogether(femaleEmployee); // 출력이안됨.. 나중에 해결


    }
}
