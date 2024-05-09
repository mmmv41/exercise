package chap16;

public class medal {
    public static void main(String[] args) {
        int myRank=1;
        String medal;

        switch (myRank) {
            case 1:
                medal="금메달";
                break;
            case 2:
                medal="은메달";
                break;
            case 3:
                medal="동메달";
                break;
            default:
                medal = "메달없음";
        }
        String result = String.format("선수의 메달은 %s 입니다.", medal);
        System.out.println(result);
    }
}

