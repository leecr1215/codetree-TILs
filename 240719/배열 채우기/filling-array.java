import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cnt = 0;
        
        int[] arr = new int[10];

        for(int i = 0; i < 10; i++){
            int num = sc.nextInt();
            if(num==0) break;

            arr[i] = num;
            cnt++;
        }

        for(int i = cnt-1; i >= 0; i--){
            System.out.print(arr[i] + " ");
        }

    }
}