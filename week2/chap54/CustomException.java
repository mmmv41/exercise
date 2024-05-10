package week2.chap54;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CustomException {
    public static void main(String[] args) {
        // DateTimeFormatter : 어떤 형식으로 년/월/일 나타낼지 명시
        // format() : 정의한 formatter로 형식 변환
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/mm/yyyy");
        String formatDateTime = LocalDate.of(2022,12,12).format(formatter);
        System.out.println("dd/mm/yyyy로 출려된 날짜는: " + formatDateTime);
    }
    
}
