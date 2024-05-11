package week3.chap65.meta;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class AnnotationUtils {
    public static void executeMethodsByRepeatAnnotation(Object object) {
        //어노테이션의 정보를 가지고 메소드를 실행하는 메소드

        Class<?> clazz = object.getClass(); // <?> : 모든 걸 뽑아낼수있다 라는 뜻 
        Method[] methods = clazz.getDeclaredMethods();

        for (Method method : methods) {
            Annotation[] annotations = method.getDeclaredAnnotations(); // 메소드에 붙은 어노테이션을 가져옴 

            for (Annotation annotation : annotations) {
                if (annotation instanceof Repeat) { // Repeat가 있으면 
                    Repeat repeatAnnotation = (Repeat) annotation; // 정보를 얻어오고 
                    int repeatCount = repeatAnnotation.value(); // 정보에서 value를 가져와 repeatCount로 두겠다.

                    for (int i = 0; i < repeatCount; i++) {
                        try {
                            method.invoke(object);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }

}
