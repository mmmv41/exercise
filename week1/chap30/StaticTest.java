package chap30;

public class StaticTest {
    public static void main(String[] args) {

        //클래스 변수
        int num = Student.serialNum;
        String city = Student.city; // 인스턴스화 하지않고 바로 사용 가능 

        Student.serialNum =10;

        //4명 

        Student student1 = new Student("Alice", "Female");
        Student student2 = new Student("Tom", "Male");
        Student student3 = new Student("Taylor", "Female");
        Student student4 = new Student("Mark","Male");

        student1.printMyInfo();
        student2.printMyInfo();
        student3.printMyInfo();
        student4.printMyInfo();
    }
}
