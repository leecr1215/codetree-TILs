import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int N = 4;

        int[][] arr = new int[N][N];

        int sum = 0;

        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                arr[i][j] = sc.nextInt();
            }
            for(int j = 0; j <= i; j++){
                sum += arr[i][j];
            }
        }
        
        System.out.println(sum);


    }
}