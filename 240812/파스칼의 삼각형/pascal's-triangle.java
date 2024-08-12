import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] pascal = new int[n+1][n+1];

        StringBuilder sb = new StringBuilder();

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                if(i == 1 || i == 2){
                    pascal[i][j] = 1;
                }
                else{
                    pascal[i][j] = pascal[i-1][j-1] + pascal[i-1][j];
                }
                sb.append(pascal[i][j]).append(" ");
            }
            sb.append("\n");
        }

        System.out.println(sb.toString());
        
    }
}