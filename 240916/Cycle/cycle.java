import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int P = sc.nextInt();
        
        int temp = N;
        int[] nums = new int[N*N+1];
        int cnt = 1;
        nums[N] = cnt;

        while(true){
            temp = (temp * N) % P;

            if(nums[temp]==0){ // 처음 등장
                nums[temp] = cnt++;
            }else{
                System.out.println(cnt - nums[temp]);
                break;
            }
        }


    }
}