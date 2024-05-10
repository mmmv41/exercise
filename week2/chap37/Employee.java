package week2.chap37;

public interface Employee {
    void workTogether(Employee employee);

    String getName(); //getter. 인터페이스에서 구현내용 정의하지 x -> 이렇게 적는다.
}
