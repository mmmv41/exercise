package week2.chap53;

import java.util.Arrays;

public class DayEnumTest {
    public static void main(String[] args) {
        //각각 ENum 값 정의
        // ordinal, compareTo, values

        Day monday = Day.MONDAY;
        Day sunday = Day.SUNDAY;
        Day thursday = Day.THURSDAY;

        System.out.println("ordinal 값: " + monday.ordinal());
        System.out.println("ordinal 값: " + sunday.ordinal());
        System.out.println("ordinal 값: " + thursday.ordinal());

        System.out.println("CompareTo:  "+ monday.compareTo(sunday)); // 1-0 = 1
        System.out.println("CompareTo:  "+ monday.compareTo(thursday)); // 1-4 = -3

        Day[] days = Day.values();
        System.out.println("Days: " + Arrays.toString(days));
    }
}
