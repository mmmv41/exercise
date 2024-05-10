package week2.chap47;

import java.util.HashSet;
import java.util.Set;

public class SetInterfaceTest {
    public static void main(String[] args) {
        
        //set 인터페이스 구현
        Set<String> fruitSet = new HashSet<>();

        //add
        fruitSet.add("orange");
        fruitSet.add("apple");
        fruitSet.add("banana");
        fruitSet.add("kiwi");

        fruitSet.add("orange"); // Set은 중복 add 안됨 

        System.out.println(fruitSet);

        //remove(set)
        fruitSet.remove("apple");
        System.out.println(fruitSet);

        //contains(key)
        System.out.println("apple 유무: " + fruitSet.contains("apple"));
        System.out.println("banana 유무: " + fruitSet.contains("banana"));

        //size, isempty, clear
        System.out.println("사이즈: " + fruitSet.size());

        fruitSet.clear();
        System.out.println("비었는지?: " + fruitSet.isEmpty());
    }
}
