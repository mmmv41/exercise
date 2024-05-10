package week2.chap36;

public class InterfaceTest {
    public static void main(String[] args) {
        
        // 속성
        System.out.println(Flyable.atmosphereLimit); // static 사용을 안해도 바로 사용가능 !! -> static final이 정의된것
//      Flyable.atmosphere = 100l -> final 이라 사용불가

        // Flyable
        Flyable bird = new Bird();
//      Bird bird1 = new Bird(); / Animal bird2 = new Bird(); 세가지 다 가능 
        Flyable airplane = new Airplane("ab001");

        bird.fly();
        // bird.eat(); -> flyable화 된 상태이기 때문. 사용불가 
        airplane.fly(); // flyable 의 fly()가 실행된 것.

        //Walkable 
        Walkable person = new Person();
        Person person2 = new Person();
        person2.setName("mark");
        Walkable robot = new Robot("RB001");

        person.walk(); //walkable의 walk() 가 실행된 것.
        robot.walk();

        if (robot instanceof Robot){ // 다운캐스팅
            Robot robot2 = (Robot) robot;
            robot2.helpPerson(person2);
        }
    }
}
