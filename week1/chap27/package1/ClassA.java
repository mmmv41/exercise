package chap27.package1;

public class ClassA {
    // public
    public String publicStr;

    //private
    private String privateStr;


    //default
    String defaultStr;


    public void methodPublic(){}

    private void methodPrivate(){}

    void methodDefault(){}

    void testPrivate(){
        String str = privateStr;
        methodPrivate();
    } //private은 자신의 안에서 정의할때만 접근 가능 
}
