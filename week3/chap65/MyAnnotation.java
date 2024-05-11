package week3.chap65;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// 메타 어노테이션
@Retention(RetentionPolicy.RUNTIME) // RUNTIME -> 항상 어노테이션 남김 
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.TYPE}) // 어디에 적용할건지 . 메소드로 정의했으므로 메소드에만 사용가능 
@Documented
public @interface MyAnnotation { // 어노테이션 정의 -> @ 를 하고 키워드로 정의. 
    // 어노테이션은 메소드를 가질 수 없다. 하지만 String name;처럼 쓰는 기본 필드와 다르게 메소드 처럼 표현되어있다. (); 로 끝남 
    String name(); // A required attribute 

    int count() default 0; // 기본값을 설정해줄 수 있다. (default 사용 )
}
