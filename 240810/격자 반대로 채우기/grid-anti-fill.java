import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] arr = new int[n][n];

        // 상좌하좌
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, -1, 0, -1};

        int d = 0;
        int x = n-1;
        int y = n-1;

        int cnt = 1;
        arr[x][y] = cnt++;

        while(true){
            int nx = x + dx[d%4];
            int ny = y + dy[d%4];

            if(nx >= 0 && nx < n && ny >= 0 && ny < n){
                // 이동 가능
                x = nx;
                y = ny;

                arr[x][y] = cnt++;
                if(cnt > n*n) break;
                

                // 현재 좌로 이동한 경우
                if(d % 4 == 1 || d % 4 == 3){
                    d++;
                }
            }else{
                // 튀어나감. 방향 바꿔주기
                d++;
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