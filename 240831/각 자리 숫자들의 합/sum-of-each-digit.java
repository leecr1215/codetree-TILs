import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] nums = sc.next().split("");

        int sum = 0;

        for(int i = 0; i < nums.length; i++){
            int num = Integer.parseInt(nums[i]);

            sum += num;
        }
        System.out.println(sum);
    }
}