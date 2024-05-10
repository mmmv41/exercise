package week2.chap47;

import java.util.HashMap;
import java.util.Map;

public class MapInterfaceTest {
    public static void main(String[] args) {
        // map 정의
        Map<String, Integer> fruitMap = new HashMap<>(); //<key, value>

        // map 에 데이터 넣기 
        fruitMap.put("orange", 5);
        fruitMap.put("apple", 10);
        fruitMap.put("banana", 3);
        fruitMap.put("kiwi", 5);

        System.out.println(fruitMap); // 순서가 매번 달라짐 

        // Get(Key)
        Integer appleCount = fruitMap.get("apple");
        Integer bananaCount = fruitMap.get("banana");

        System.out.println("사과 개수: " + appleCount);
        System.out.println("바나나 개수: " + bananaCount);

        //contains(key) -> key가 있는지 없는지 확인
        Boolean isApple = fruitMap.containsKey("apple");
        Boolean isMango = fruitMap.containsKey("mango");

        System.out.println("Apple 유무: " + isApple);
        System.out.println("Mango 유무: " + isMango);

        //remove(Key)
        fruitMap.remove("apple");
        System.out.println("fruitMap: " + fruitMap);

        //size 
        System.out.println("fruitMap 사이즈: " + fruitMap.size());

        //KeySet()
        System.out.println(fruitMap.keySet()); // key만 알고싶을때 
    }
}
