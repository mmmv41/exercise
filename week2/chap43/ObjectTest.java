package week2.chap43;

public class ObjectTest {
    public static void main(String[] args) {
        Object customer = new Customer("mark");
        // 인스턴스는 Customer, 타입은 Object 로 업캐스팅.

        System.out.println(customer.toString());
    }
}
