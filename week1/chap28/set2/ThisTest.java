package chap28.set2;

public class ThisTest {
    public static void main(String[] args) {
        
        Person person1 = new Person("Tom");
        Person person2 = new Person("Timmy","Male");
        Person person3 = new Person("Austin", "Male", 30);

        person1.showMyself();
        person2.showMyself();
        person3.showMyself();
    }
}
