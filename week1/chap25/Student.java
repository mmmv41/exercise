package chap25;

public class Student {
    String schoolName;
    int classYear; // 몇학년
    int classRoomNumber; // 몇반
    int studentNumber;// 몇번
    
    // 기본 정보
    String name;
    String gender;

    //행위 
    void study(Teacher teacher, String subjectName){
        String teacherName = teacher.name;
        System.out.printf("저는 %s 선생님에게 %s 과목을 배웁니다. ",teacherName,subjectName);
    }

}
