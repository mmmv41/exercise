package chap16;

public class Avocado {
    public static void main(String[] args) {
        //장보기 전
        int milks = 0;
        int avocados = 0;
        boolean existedAvocado = true; // 아보카도가 있는가 ? true

        //장보기
        milks= 1;
        if (existedAvocado) { // 아보카도가 있으면 
            milks = 6;
        }
        else { // 아보카도가 없으면 
            milks = 1;
        }
        String comment = String.format("%d개 아보카도, %d개 우유",avocados,milks);
        System.out.println(comment);
    }
}


