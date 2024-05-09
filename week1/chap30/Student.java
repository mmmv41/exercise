package chap30;

import chap28.set1.Teacher;

public class Student {
    static int serialNum = 1;
    static String city = "seoul";

    private String schoolName;
    private int classYear; // 몇학년
    private int classRoomNumber; // 몇반
    private int studentNumber;// 몇번
    private int studentID; // student 고유 아이디 
    
    // 기본 정보
    private String name;
    private String gender;

    //정적 메소드
    public static int getSerialNum(){
        return serialNum;
    }

    public static void setSerialNum(int serialNum) {
        Student.serialNum = serialNum;
    }



    //행위 
    void study(Teacher teacher, String subjectName){
        String teacherName = teacher.getName();
        System.out.printf("학생: 저는 %s 선생님에게 %s 과목을 배웁니다.\n",teacherName,subjectName);
    }

    public void printMyInfo(){
        System.out.printf("[Student] schoolName: %s, classYear: %d" +
        "classRoomNumber: %d, studentNumber: %d, studentID: %d, name: %s, gender: %s\n"
        ,schoolName,classYear,classRoomNumber,studentNumber,studentID,name,gender);
    }

    //생성자
    Student(){

    }
    Student(String name, String gender){
        this (name, gender,"school",1,3,30);
    }

    Student(String name, String gender, String schoolName, int classYear, int classRoomNumber, int studentNumber ){
        this.name = name;
        this.gender = gender;
        this.schoolName = schoolName;
        this.classYear = classYear;
        this.classRoomNumber = classRoomNumber;
        this.studentNumber = studentNumber;
        this.studentID = serialNum++; // 처음에는 serialNum 으로 들어가고, 이후에 1씩 올라감
    }
    // 생성자 매개변수와 클래스 안의 변수 이름 달라야함 ! 
    //즉, String schoolName은 위에서 이미 정의 됐기 때문에 pSchoolName 이라고 해줘야함

    // getter (호출할 때)
    public String getName(){
        return name;
    }

}
