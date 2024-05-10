package week2.chap56;

@FunctionalInterface
public interface GenericLambda<T> { // 람다식이기 때문 <T> 넣기
    T calculate (T t);
}
