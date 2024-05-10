package week2.chap54;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeTest {
    public static void main(String[] args) {
        //현재 시간 출력
        LocalDateTime now = LocalDateTime.now();
        System.out.println("현재 시각은: " + now);

        //특정 년/월/일 가져오기, 요일
        LocalDate past = LocalDate.of(2022,12,12);
        System.out.println("해당 날짜 년/월/일 은: " +  past);
        System.out.println("해당 날짜 요일은: " + past.getDayOfWeek());
        
        //날짜 포맷 바꾸기
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formatDateTime = past.format(formatter);
        System.out.println("dd/MM/yyyy로 출려된 날짜는: " + formatDateTime);
    }
}
