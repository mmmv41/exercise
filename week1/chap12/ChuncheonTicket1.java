package chap12;

public class ChuncheonTicket1 {
    public static void main(String[] args) {
        int priceKim = 3000;
        int pricePark = 5000;
        int priceLee = 2000;
        int priceHong = 2000;

        int ticketPrice = (priceKim + pricePark + priceLee + priceHong) /4;
        System.out.println(ticketPrice);
    }
}
