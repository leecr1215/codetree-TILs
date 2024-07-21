import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int evenSum = 0;

        int mutiplesOfThreeSum = 0;
        int cnt = 0;

        for(int i = 0; i < 10; i++){
            int num = sc.nextInt();

            if(i % 2 != 0){
                evenSum += num;
            }

            if((i + 1) % 3 == 0){
                cnt++;
                mutiplesOfThreeSum += num;
            }
        }

        System.out.printf("%d %.1f", evenSum, mutiplesOfThreeSum / (double)cnt);

        
    }
}