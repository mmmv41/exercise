package chap16;

public class ParkingLotMission {
    public static void main(String[] args) {
        //
        int useMoney = 60_000;
        int parkingTime = 6;
        
        if (useMoney >=200_000){
            parkingTime = parkingTime - 5;
        } else if (useMoney >= 100_000){
            parkingTime = parkingTime -4;
        } else if (useMoney >= 50_000){
            parkingTime = parkingTime -3;
        } else if (useMoney >= 30_000){
            parkingTime = parkingTime -2;
        }else if (useMoney >= 10_000){
            parkingTime = parkingTime -1;
        }
        String result = String.format("사용금액 : %d, %d시간 결제 해야함",useMoney,parkingTime);
        System.out.println(result);
    }
}
