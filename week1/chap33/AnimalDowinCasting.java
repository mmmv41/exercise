package chap33;

public class AnimalDowinCasting {
    public static void main(String[] args) {
        //다운 캐스팅
        
        Animal animal = new Bird(); 
        checkBirdAndFly(animal); // animal 이면 다운캐스팅 -> bird.fly() 실행 

        Animal animal2 = new Animal(); // -> aniaml로 만들었기 때문에 bird 로 다운캐스팅 불가
        checkBirdAndFly(animal2);
        // Animal cannot be cast to class chap33.Bird 

        Animal animal3 = new Person();
        checkBirdAndFly(animal3);

    }
    static void checkBirdAndFly(Animal animal){
        if (animal instanceof Bird){ // Bird로 이루어졌는지 
            Bird bird = (Bird) animal; // 다운캐스팅
            bird.fly();
        }
        else {
            System.out.println("너는 새가 아니야");
        }
        // animal에는 fly 메소드가 없으므로 bird 클래스로 부터 다운캐스팅 
    }    
    
}
