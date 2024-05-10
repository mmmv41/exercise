package week2.chap44;

public class StringCharArrayTest {
    public static void main(String[] args) {
        //charArray -> String
        char[] chars = {'a', 'b', 'c'};

        // 방법 1
        String str1 = new String(chars);
        // 방법 2
        String str2 = String.valueOf(chars);

        System.out.println(str1);
        System.out.println(str2);

        //String -> charArray
        char[] chars2 = str1.toCharArray();

        for (char ch: chars2){ // chars2라는 문자 배열의 모든 요소를 순회하면서 각 문자를 출력
            System.out.println(ch);
        }
        
        System.out.println(str1.charAt(0)); // array의 첫번째 인덱스 출력 -> a
        System.out.println(str1.charAt(1)); // b
        System.out.println(str1.charAt(2)); // c
    }   
}
