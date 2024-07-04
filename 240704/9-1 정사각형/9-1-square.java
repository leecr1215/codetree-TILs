import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] nums = new int[9];

        for(int i = 9; i > 0; i--){
            nums[9-i] = i;
        }


        int cnt = 0;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(nums[cnt % 9]);
                cnt++;
            }
            System.out.println();
        }
    }
    
}