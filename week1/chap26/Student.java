package chap26;

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
        System.out.printf("학생: 저는 %s 선생님에게 %s 과목을 배웁니다.\n",teacherName,subjectName);
    }

    //생성자
    Student(){

    }

    Student(String pName, String pGender, String pSchoolName, int pClassYear, int pClassRoomNum, int pStudentNum ){
        name = pName;
        gender = pGender;
        schoolName = pSchoolName;
        classYear = pClassYear;
        classRoomNumber = pClassRoomNum;
        studentNumber = pStudentNum;
    }
    // 생성자 매개변수와 클래스 안의 변수 이름 달라야함 ! 
    //즉, String schoolName은 위에서 이미 정의 됐기 때문에 pSchoolName 이라고 해줘야함

}
