import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] arr = new int[n][n];

        int cnt = 1;
        boolean check = true;
        for(int i = n-1; i >= 0; i--){
             
            if(!check){
                for(int j = 0; j < n; j++){
                    arr[j][i] = cnt++;
                }
                check = !check;

            }else{
                for(int j = n-1; j >= 0; j--){
                    arr[j][i] = cnt++;
                }
                check = !check;

            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                sb.append(arr[i][j] + " ");
            }
            sb.append("\n");
        }
        
        System.out.println(sb.toString());
    }
}