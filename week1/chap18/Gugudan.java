package chap18;

public class Gugudan {
    public static void main(String[] args) {
        int i;
        int j;
        int result ;
        for (i = 2; i <= 9; i++) {
            for ( j = 1; j <= 9; j++) {
                result = i * j;
                System.out.printf("%d * %d = %d\n",i,j,result);
            }
            System.out.println();
        }
    }
}
