import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int N = 2;
        final int M = 4;

        int[][] arr = new int[N][M];

        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                arr[i][j] = sc.nextInt();
            }
        }

       
        int sum = 0;
        for(int i = 0; i < N; i++){
            int colSum = 0;

            for(int j = 0; j < M; j++){
                colSum += arr[i][j];
            }

            sum += colSum;

            System.out.print(Math.round((double)colSum / M * 10) / 10.0 + " ");
        }

        System.out.println();

        for(int i = 0; i < M; i++){
            int rowSum = 0;

            for(int j = 0; j < N; j++){
                rowSum += arr[j][i];
            }

            System.out.print(Math.round((double)rowSum / N * 10) / 10.0 + " ");
        }

        System.out.println();

        System.out.print(Math.round((double)sum / (M * N) * 10) / 10.0 + " ");

        
    }
}