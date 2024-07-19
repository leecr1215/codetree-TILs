import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int STUDENT_CNT = 8;
        double sum = 0;

        for(int i = 0; i < STUDENT_CNT; i++){
            sum += sc.nextDouble();
        }

        System.out.println(Math.round(sum / STUDENT_CNT * 10) / 10.0);

    }
}