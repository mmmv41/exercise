package week2.chap56;

import java.util.Optional;
import java.util.function.Supplier;

public class OptionalLambdaTest {
    public static void main(String[] args) {
        String str = "abc";

        // NullPointerExcepion 을 회피하기 위한 데이터타입 중 하나 
        Optional<String> stringOptional = Optional.ofNullable(str);

        Supplier<String> stringSupplier = ()-> "defalut";
        // String str2 = stringOptional.orElseGet( () -> {throw new CustomException("customException");})
        //                             .toUpperCase();

    }
}
