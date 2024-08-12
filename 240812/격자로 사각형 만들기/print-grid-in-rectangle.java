import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] arr = new int[n+1][n+1];

        for(int i = 1; i <= n; i++){
            arr[i][1] = 1;
            arr[1][i] = 1;
        }

        StringBuilder sb = new StringBuilder();

        for(int i = 2; i <= n; i++){
            for(int j = 2; j <= n; j++){
                arr[i][j] = arr[i-1][j] + arr[i][j-1] + arr[i-1][j-1];
            }
        }

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                sb.append(arr[i][j] + " ");
            }

            sb.append("\n");
        }

        System.out.println(sb.toString());


    }
}