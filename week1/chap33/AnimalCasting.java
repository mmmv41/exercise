package chap33;

public class AnimalCasting {
    public static void main(String[] args) {
        Animal[] animals = { // array 바로 초기화 가능 
            new Animal(), new Person(), new Person(), new Fish(), new Bird(), 
            new Person(), new Fish(), new Fish(), new Bird(), new Animal()
        };

        sleepTogether(animals);

        System.out.println("--------------------------");

        doSomethingSeparately(animals);
    }

    static void sleepTogether(Animal[] animals){ // animal array로 받을것 
        for(Animal animal: animals){ //for loop : 하나의 animal 씩 꺼내서 실행 
            animal.sleep();
        }
    }

    static void doSomethingSeparately(Animal[] animals){
        for(Animal animal: animals){
            if(animal instanceof Bird){
                Bird bird = (Bird) animal; // bird로 다운캐스팅
                bird.fly();
            }
            else if (animal instanceof Fish){
                Fish fish = (Fish) animal; //fish 로 다운캐스팅
                fish.swim();
            }
            else if (animal instanceof Person){
                Person person = (Person) animal; //person 으로 다운캐스팅
                person.walk();
            }
            else {
                System.out.println("동물 클래스이거나 지원하지 않는 객체입니다. \n");
            }
        }
    }
}
