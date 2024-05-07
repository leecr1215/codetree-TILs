import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cnt = 0;
        int sum = 0;

        for(int i = 0; i < 10; i++){
            int num = sc.nextInt();

            if(num >= 0 && num <= 200){
                cnt++;
                sum += num;
            }
        }

        System.out.printf("%d %.1f", sum, (double)sum / cnt);
    }
}