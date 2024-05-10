package week2.chap55;

public class OuterStaticClass { 
    
    public OuterStaticClass(int outerdata) {
       // this.outerdata = outerdata; 
    }

    private static int outerdata; // static으로 올려줘야 함. -> 초기값 0. 
    // static은 클래스가 만들어질때 생성됨. innerfield는 인스턴스화 할때 만들어짐

    public static class InnerClass{ // static으로 만들었으면 정의하는 것도 static이여야함.
        private int innerdata;

        public InnerClass(int innerdata) {
            this.innerdata = innerdata;
        }

        void display(){
            System.out.println("outerdata: "+outerdata); 
            System.out.println("innerdata "+innerdata);
        }
    }
}
