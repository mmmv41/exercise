package week2.chap43;

public class EqualsTest {
    public static void main(String[] args) {
        Customer customer1 = new Customer("ID1", "mark");
        Customer customer2 =  customer1;

        Customer customer3 = new Customer("ID1","mark");
        
        // System.out.println(customer1);
        // System.out.println(customer3);

        System.out.println(customer1.equals(customer2));
        System.out.println(customer1.equals(customer3));
        
        System.out.println(customer1 == customer3);
    }
}
