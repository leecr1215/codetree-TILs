import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] cost = new int[n];

        for(int i = 0; i < n; i++){
            cost[i] = sc.nextInt();
        }

        int maxProfit = 0;
        int min = cost[0];
        int max = cost[0];

        for(int i = 1; i < n; i++){
            if(cost[i] > max){
                max = cost[i];
                maxProfit = maxProfit < max - min ? max-min : maxProfit;
            }else if(cost[i] < min){
                min = cost[i];
                max = cost[i];
            }else{

            }
        }

        System.out.println(maxProfit);

        
    }
}