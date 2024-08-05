import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n+1];

        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        

        int idx = n;
        int max = nums[n-1];

        while(idx != 0){

            for(int i = idx-1; i >= 0; i--){
                if(nums[i] >= max){
                    max = nums[i];
                    idx = i;
                }
            }

            max = 0;

            System.out.print(idx + 1 + " ");
        }
    }
}