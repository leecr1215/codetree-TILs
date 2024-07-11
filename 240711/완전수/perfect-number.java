import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int start = sc.nextInt();
        int end = sc.nextInt();

        int cnt = 0;
        for(int i = start; i <= end; i++){
            if(getDivisorSum(i) == i){
                cnt++;
            }
        }

        System.out.println(cnt);

    }

    public static int getDivisorSum(int num){
        int sum = 0;

        for(int i = 2; i <= (int)Math.sqrt(num); i++){
            if(num % i == 0){
                // 약수임
                sum += i;
                sum += num / i;
            }
        }
        // 1도 포함해야함
        sum += 1;

        return sum;
    }
}