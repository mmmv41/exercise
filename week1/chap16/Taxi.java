package chap16;

public class Taxi {
    public static void main(String[] args) {
        int time = 3;
        int cost = 15_000;
        String home ="seoul";

        if (0< time && time<4){
            cost = (int) (cost *1.2);
            //cost *1.2 의 값이 double이 될 수 있어서 int로 형 변환 !!
        } 
        if(home != "seoul"){
            cost = (int) (cost *1.2);
        }
        String result = String.format("지불금액은 %d 입니다", cost);
        System.out.println(result);
    }
}
