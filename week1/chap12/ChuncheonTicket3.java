package chap12;

public class ChuncheonTicket3 {
    public static void main(String[] args) {
        // Q) 서로 다른 3명의 손님이 왔다. 3명은 반값 할인 적용 대상인가? 아닌가?
        // 나이가 65세 이상이고, 국적이 ＂한국”이면 반값으로 줄 예정이다.
        // Alice(나이: 70, 나라: 미국)
        // Kim (나이: 65, 나라: 한국)
        // Yoo (나이: 42, 나라: 한국)
        int ageOfAlice = 70;
        String countryOfAlice = "USA";
    
        int ageOfKim = 65;
        String countryOfKim = "Korea";
    
        int ageOfYoo = 42;
        String countryOfYoo = "Korea";

        boolean alicePrice = (ageOfAlice >= 65 && countryOfAlice == 
        "Korea");
        boolean kimPrice = (ageOfKim >= 65 && countryOfKim == "Korea");
        boolean yooPrice = (ageOfYoo >=65 && countryOfYoo == "Korea");

        System.out.println("Alice는 적용 대상자인가?");
        System.out.println(alicePrice);
        System.out.println("Kim는 적용 대상자인가?");
        System.out.println(kimPrice);
        System.out.println("Yoo는 적용 대상자인가?");
        System.out.println(yooPrice);
    }
}
