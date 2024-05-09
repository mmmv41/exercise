package chap26;

public class InstanceTest {
    public static void main(String[] args) {
        Student student1 = new Student("Bob","Male","School",1,3,20);
        // student1.name = "Bob";
        // student1.gender = "Male";
        // student1.schoolName = "School";
        // student1.classYear = 1;
        // student1.classRoomNumber = 3;
        // student1.studentNumber = 20;

        System.out.println(student1.name);
        System.out.println(student1.gender);
        System.out.println(student1.schoolName);

        Student student2 = new Student();
        student2.name = "Alice";
        student2.gender = "Female";
        student2.schoolName = "School";
        student2.classYear = 2;
        student2.classRoomNumber = 3;
        student2.studentNumber = 21;

        Student student3 = new Student();
        Student student4 = new Student();

        Teacher teacher = new Teacher("Tom","Female","korean","A001");
        // teacher.name = "Tom";
        // teacher.gender = "Female";
        // teacher.schoolName ="School";

        //subject 선행해서 만들어줌 -> subject를 Subject 클래스에서 가쟈왔기때문
        // Subject koreanSubject = new Subject();
        // koreanSubject.subjectName = "korean";
        // koreanSubject.subjectCode = "A001";

        // teacher.subject = koreanSubject;

        System.out.println(teacher.name);
        System.out.println(teacher.gender);
        System.out.println(teacher.subject.subjectCode); //이렇게 입력해야함 !! 헷갈림주의
    }
}
