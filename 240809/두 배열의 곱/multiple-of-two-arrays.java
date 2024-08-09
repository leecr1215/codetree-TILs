import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int N = 3;

        int[][] arr = new int[N][N];

        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                sb.append(sc.nextInt() * arr[i][j] + " ");
            }
            sb.append("\n");
        }

        System.out.println(sb.toString());
        
    }
}