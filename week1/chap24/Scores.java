package chap24;

public class Scores {
    public static void main(String[] args) {
        // A class 학생 점수
        int studentAClass1 = 50;
        int studentAClass2 = 30;
        int studentAClass3 = 45;

        //B class 학생 점수
        int studentBClass1 = 60;
        int studentBClass2 = 65;
        int studentBClass3 = 66;

        // A Class Average 
        // int sumAClass = studentAClass1 + studentAClass2 + studentAClass3;
        // double averageAClass = sumAClass / (double) 3; //더블로하려면 명시적 변환.
        double averageAClass = calculateAverage(studentAClass1,studentAClass2, studentAClass3);

        // B class Average
        // int sumBClass = studentBClass1 + studentBClass2 + studentBClass3;
        // double averageBClass = sumBClass / (double) 3;
        double averageBClass = calculateAverage(studentBClass1,studentBClass2, studentBClass3);

        System.out.printf("A 학급의 평균 점수는 %.2f, B 학급의 평균 점수는 %.2f\n",averageAClass,averageBClass);
        // %.2f (소수점 둘째 자리까지만 나오게)
    }

    static double calculateAverage(int studentScore1, int studentScore2, int studentScore3){
        int sumBClass = studentScore1 + studentScore2 + studentScore3;
        return sumBClass / (double) 3;
    } 
}
