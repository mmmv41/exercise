package week2.chap54;

import java.util.Optional;

public class StringNullThrowTest {
    public static void main(String[] args) {
        String str = null;
        Optional<String> stringOptional = Optional.ofNullable(str);

        // int length = stringOptional.orElseThrow( () -> {throw new CustomException("CustomException이 발생했습니다.");})
        // .length(); // customException을 던지는 로직이 실행이돼라. null일 때 실행. null이 아니면 length로 .
        // System.out.println(length);
    }
}
