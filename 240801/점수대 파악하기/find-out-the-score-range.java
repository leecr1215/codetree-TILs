import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] count = new int[11];

        int score;
        while((score = sc.nextInt())!=0){
            count[score / 10]++;
        }

        for(int i = 10; i >= 1; i--){
            System.out.println(i * 10 + " - " + count[i]);
        }
        
    }
}