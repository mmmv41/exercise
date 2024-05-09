package chap28.set1;

public class Teacher {
    //학교 정보
    String schoolName;

    //담당 과목
    private Subject subject;
    //String subjectName;
    //String subjectCode; 인데 묶어서 Subject 클래스 사용

    //기본 정보
    private String name;
    private String gender;

    //행위
    void teach(Student student, String subjectName){
        String studentName = student.getName(); 
        //student라는 객체를 이용해 Student 클래스의 name을 가져오겠다
        System.out.printf("선생: %s 학생에게 %s 과목을 가르치고 있습니다.\n",studentName,subjectName);
    }

    Teacher() {

    }

    Teacher(String name, String gender, String subjectName, String subjectCode){
        this.name = name;
        this.gender = gender;

        Subject subject = new Subject();
        subject.setSubjectName(subjectName);
        subject.setSubjectCode(subjectCode);
    
        this.subject = subject;
        //this.subject = subject; < 만약 생성자 매개변수가 String subject 였다면
    }

    //getter (호출할 때)
    public String getName(){
        return name;
    } 
}
