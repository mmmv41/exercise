package week2.chap55;

public class OuterClass {

    public OuterClass(int outerdata) {
        this.outerdata = outerdata;
    }

    private int outerdata;

    public class InnerClass{

        private int innerdata;

        public InnerClass(int innerdata) {
            this.innerdata = innerdata;
        }
        
        void display(){
            System.out.println("outerdata: " + outerdata); //private이지만 내부클래스에서 사용가능 
            System.out.println("innerdata: " + innerdata);
        }
        // public class InnerClass2{ -> 무한 생성 가능 

        // }
    }
}
