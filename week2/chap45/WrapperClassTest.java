package week2.chap45;

public class WrapperClassTest {
    public static void main(String[] args) {
        
        //integer
        Integer integer1 = new Integer(20); // int -> integer 로 boxing
        Integer integer2 = null; // null을 넣을 수 있음 (null 넣을때는 Integer사용)

        int int1 = integer1.intValue(); // integer -> int로 unboxing
        // null 넣을 수 없음 

        Integer integer3 = 40; // autoboxing, = new Integer(40)
        int int2 = integer3; // autounboxing. integer -> int로  

        System.out.println(integer1);
        System.out.println(int1);
        System.out.println(integer3);
        System.out.println(int2);

        System.out.println(integer2 + int2);


        //character
        Character character = new Character('x'); // charTy[e -> character로 boxing
        char ch1 = character.charValue(); // character -> charType으로 unboxing 

        Character character2 = 'a';
        char ch2 = character2;

        System.out.println(character);
        System.out.println(ch1);

        Character[] characters = {'a', 'b', 'c'};
        char[] chars = {'a', 'b', 'c'};

        String str = String.valueOf(characters);
        String str2 = String.valueOf(chars);

        System.out.println(str);
        System.out.println(str2);


        //boolean type
        Boolean boolean1 = new Boolean(true); // true boolean -> Boolean으로 boxing
        boolean b1 = boolean1.booleanValue(); // unboxing

        Boolean boolean2 = false;
        boolean b2 = boolean2;

        System.out.println(boolean1 & boolean2); // true & false -> false
        System.out.println(boolean1 | boolean2); // true | false -> true 
    }
}
