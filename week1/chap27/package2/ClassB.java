package chap27.package2;

import chap27.package1.ClassA;

public class ClassB {
    public void testPublish(ClassA classA){
        String str = classA.publicStr;
        classA.methodPublic();
    }
}
