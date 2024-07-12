import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int cnt = 0;

        int[] arr = new int[10];

        for(int i = 0; i < 10; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < 10; i++){
            if(arr[i] < 250){
                cnt++;
                sum += arr[i];
            }
            else break;
        }
        
        System.out.println(sum + " " + String.format("%.1f", sum / (double)cnt));
    }
}