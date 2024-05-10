package week2.chap34;

public class Test {
    public static void main(String[] args) {
        
        Customer customer = new Customer("mark");
        VIPCustomer vipCustomer = new VIPCustomer("tom");

        customer.printMyInfo();
        vipCustomer.printMyInfo();
        
    }
}
