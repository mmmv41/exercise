package chap28.set2;

public class Person {
    //
    private String name;
    private String gender;
    private int age;


    public void showMyself(){
        System.out.printf("Person 인스턴스: name: %s, gender: %s, age: %d\n", this.name, this.gender, this.age);
    }

    //this를 통해 바로 밑의 파라미터가 하나 더 많은 생성자를 호출. 
    public Person(String name){
        this(name, "unknown");
    }

    public Person(String name, String gender){
        this(name,gender,-1); //생성자가 있어야만 사용가능 
    }

    public Person(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
    //
    public Person returnMyself(){
        return this;
    } // 나 자신을 리턴하는것도 가능하다. 
}
