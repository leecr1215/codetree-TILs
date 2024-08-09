import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[n][m];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(sc.nextInt() == arr[i][j]){
                    sb.append(0 + " ");
                }else{
                    sb.append(1 + " ");
                }
            }
            sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}