package chap27.package1;

public class ClassAA {
    void testPublic(ClassA classA){ // 인자를 ClassA로 받는다
        String str = classA.publicStr;
        classA.methodPublic();
        // 같은 패키지에있는 (패밀리인) ClassAA에서는 ClassA의 publicStr, methodPublic이 접근가능하다. 
    }

    void testDefault(ClassA classA){
        String str = classA.defaultStr;
        classA.methodDefault();
    }

    // void testPrivate(ClassA classA){
    //     String str = classA.privateStr;
    //     classA.methodPrivate();
    // } -> private이기 때문에 같은 family여도 사용 불가 
}
