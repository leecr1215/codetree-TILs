import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] cnt = new int[10001];

        for(int i = 0; i < n; i++){
            cnt[sc.nextInt()]++;
        }

        int result = -1;

        for(int i = 1000; i > 0; i--){
            if(cnt[i] == 1){
                result = i;
                break;
            }
        }

        System.out.println(result);

    }
}