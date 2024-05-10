package week2.chap46;

import java.util.ArrayList;
import java.util.List;

public class ListInterfaceTest {
    public static void main(String[] args) {
        // List 정의
        List<String> fruitList = new ArrayList<>(); // arraylist로 list타입의 fruitlist를 정의

        //add
        fruitList.add("orange");
        fruitList.add("apple");
        fruitList.add("kiwi"); // 순서대로 들어간다

        System.out.println("FruitList 요소: " + fruitList);

        //add(index, element)
        fruitList.add(3,"mango"); // 3의 자리에 망고가 들어간다 

        System.out.println("FruitList 요소: " + fruitList);

        //remove(index)
        fruitList.remove(3); // 3의 자리를 삭제 
        System.out.println("FruitList 요소: " + fruitList);

        //get(index)
        String myFruit = fruitList.get(2);
        System.out.println("2번째 자리의 과일은: " + myFruit);

        //set(index, element)
        fruitList.set(1, "pineapple"); // 1의 자리를 pineapple 로 변경 
        System.out.println("FruitList 요소: " + fruitList);

        //size 
        System.out.println("리스트 사이즈: " + fruitList.size()); 

        //isEmpty
        List<String> fruitList2 = new ArrayList<>();
        System.out.println(fruitList2.isEmpty()); // 비었으면 -> true

        //contains -> list에 해당원소가 있는지 없는지 확인하는 메소드
        System.out.println(fruitList.contains("kiwi"));
        System.out.println(fruitList.contains("apple"));

        //IndexOf, Clear
        String myFruit2 = "kiwi";
        System.out.println(fruitList.indexOf(myFruit2)); // -> 2 . 2의 자리에 있다. 
        String myFruit3 = "apple";
        System.out.println(fruitList.indexOf(myFruit3)); // -> -1 . 없으면 -1

        fruitList.clear();
        System.out.println("FruitList 요소: " + fruitList);

            
    }
}
