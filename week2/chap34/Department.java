package week2.chap34;

public class Department {
    public static void main(String[] args) {
        
        // 전제 상황
        int price = 10000;
        Staff staff = new Staff();
        staff.addSalesAmouny(1_000_000);

        Customer customer1 = new VIPCustomer("amy");

        Customer[] customerQueue = {
            new Customer("mark"), customer1,new Customer("tom"), 
            new VIPCustomer("alice"), new Customer("ben"), customer1,
            new GolderCustomer("jay"), new GolderCustomer("april")
        };

        // 시나리오
        for(Customer customer: customerQueue){
            customer.printMyInfo();
            int cash = staff.helpPayment(customer, price);
            System.out.printf("내가 내는 금액은 : %d\n" ,cash);
            staff.addSalesAmouny(cash);
        }

        staff.printMySalesAmount();
    }
}
