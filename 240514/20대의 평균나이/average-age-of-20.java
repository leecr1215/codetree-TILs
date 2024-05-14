import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cnt = 0;
        int sum = 0;

        while(true){
            int num = sc.nextInt();

            if(num < 20 || num >= 30) break;

            sum += num;
            cnt++;
        }

       System.out.println(String.format("%.2f", Math.round((double)sum / cnt * 100) / 100.0));
    }
}