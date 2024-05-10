package week2.chap44_2;

public class StringBuilderTest {
    public static void main(String[] args) {
        // += 
        String str = "";
        
        long startTime = System.currentTimeMillis(); //ms 단위로 출력 

        for (int i = 0; i < 50000; i++) {
            str += "Cat";
        }
        //System.out.println(str);

        long endTime = System.currentTimeMillis();
        System.out.println("걸린시간: " + (endTime - startTime) + "ms");

        ///////////////////

        long startTime2 = System.currentTimeMillis();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 50000; i++) {
            sb.append("Cat"); // append = '+'
        }

        String output = sb.toString(); // append해서 toString()으로 바꿔야함
        //System.out.println(output);

        long endTime2 = System.currentTimeMillis();
        System.out.println("SB 걸린 시간: " + (endTime2 - startTime2) + "ms");

    }
}
