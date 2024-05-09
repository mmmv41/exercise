package chap26;

public class ClassRoom {
    public static void main(String[] args) {
        // 학생 네명
        // 인스턴스 생성
        Student student1 = new Student("Bob","Male","school",1,3,20);
        Student student2 = new Student("Alice","Female","school",1,3,21);
        Student student3 = new Student("Amy","Female","school",1,3,30);
        Student student4 = new Student("Timmy","Male","school",1,3,27);

        Teacher teacher = new Teacher("Tom","Female","korean","A001");

        String subjectName1 = "korean";

        //본격적인 로직 흐름 시작 
        teacher.teach(student1,subjectName1);
        student1.study(teacher, subjectName1);

        teacher.teach(student2, subjectName1);
        student2.study(teacher, subjectName1);

        teacher.teach(student3, subjectName1);
        student2.study(teacher, subjectName1);

        teacher.teach(student4, subjectName1);
        student2.study(teacher, subjectName1);
    }    
}
