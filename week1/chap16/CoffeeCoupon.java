package chap16;

public class CoffeeCoupon {
    public static void main(String[] args) {
        int age = 14; // 나이를 직접 입력
        String watch ;
        if (age < 0) {
        watch =  "유아 관람불가";
        }
        if (age >= 0 && age < 12) {
        watch =  "전체 관람가";
        }
        if (age >= 12 && age < 15) {
        watch = "12세 이상 관람가";
        }
        if (age >= 15 && age < 19) {
        watch=  "15세 이상 관람가";
        }
        else {
        watch =  "청소년 관람불가";
        }
        
        String result = String.format("영화 관람 등급은 %s 입니다.");
        System.out.println(result);
        }
}
