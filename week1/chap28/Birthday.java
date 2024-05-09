package chap28;

public class Birthday {
    
    private int year;
    private int month;
    private int day;

    public void setYear(int year) {
        this.year = year;
    }

    private void printHi(){
        System.out.println("Hi");
    }

    Birthday(int year, int month, int day){ //constructor. 생성자 만들기
        this.year = year;
        this.month = month;
        this.day = day;
        this.printHi(); //자신의 메소드 사용
    }
}
