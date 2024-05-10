package week2.chap55;

public class OuterClassTest {
    public static void main(String[] args) {
        //일반 중첩 클래스
        OuterClass outerClass = new OuterClass(20);
        OuterClass.InnerClass innerClass1 = outerClass.new InnerClass(10);

        innerClass1.display();

        //정적 중첩 클래스
        OuterStaticClass outerStaticClass = new OuterStaticClass(30);
        OuterStaticClass.InnerClass innerclass2 = new OuterStaticClass.InnerClass(10);

        innerclass2.display();
    }
}
