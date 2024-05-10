import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int score;
        while((score = sc.nextInt()) != 25){
            if(score < 25){
                System.out.println("Higher");
            }else {
                System.out.println("Lower");
            }
        }

        System.out.println("Good");

    }
}