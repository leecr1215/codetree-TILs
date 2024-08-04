import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];

        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }

        Arrays.sort(nums);

        System.out.print(nums[0] + " ");

        int cnt = 0;

        for(int num : nums){
            if(num == nums[0]){
                cnt++;
            }
        }

        System.out.println(cnt);

    }
}