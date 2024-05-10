// package week2.chap57;

// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.List;
// import java.util.stream.Stream;

// public class StreamTest1 {
//     public static void main(String[] args) {
        
//         //Stream.of , Arrays.Stream, Collection(=list) -> Stream
//         Stream<String> fruit = Stream.of("apple","banana","orange"); // string 타입의 stream 생성
//         Stream<Integer> integerStream = Stream.of(1,2,3,4,5,6,7,8,9,10);

//         //Array.Stream
//         Stream<String> fruit2 = Arrays.stream(new String[] {"apple","banana","orange"});
//         Stream<Integer> integStream2 = Arrays.stream(new Integer[] {1,2,3,4,5,6,7,8,9,10});

//         //Collection 가장 많이 사용함 
//         List<String> fruitList = new ArrayList<>();
//         fruitList.add("apple");
//         fruitList.add("banana");
//         fruitList.add("grapes");
//         fruitList.add("mango");

//         Stream<String> fruitsStream = fruitList.stream();

//         List<Integer> integerList = new ArrayList<>();
//         integerList.add(1);
//         integerList.add(2);
//         integerList.add(3);
//         integerList.add(4);
//         integerList.add(5);
//         integerList.add(6);
//         integerList.add(7);
//         integerList.add(8);
//         integerList.add(9);
//         integerList.add(10);

//         Stream<Integer> integerStream3 = integerList.stream();

//         //stream 가지고 for-loop
//         for(String fruit4: fruitList){
//             System.out.println("for-loop로 fruit 산출: " + fruit4.toUpperCase() );
//         }

//         //stream
//         fruitsStream.forEach( (fruit4) -> System.out.println("foreach로 fruit 산출: " + fruit4.toUpperCase() ));

//     }
// }
