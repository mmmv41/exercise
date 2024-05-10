package week2.chap37;

public interface FamilyRole extends Daddy,Husband{ // 인터페이스끼리  핪치기

    @Override
    default void sayLoveEveryday() { // 두 인터페이스의 공통메소드 적어주기
        Daddy.super.sayLoveEveryday();
        Husband.super.sayLoveEveryday();
    } 
    
}
