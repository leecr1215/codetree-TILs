public class Main {
    public static void main(String[] args) {
        final int n = 5;
        int[][] arr = new int[n][n];

        // 첫 번째 행과 열 1로 초기화
        for(int i = 0; i < n; i++){
            arr[0][i] = 1;
            arr[i][0] = 1;
        }

        // 나머지 칸 채우기
        for(int i = 1; i < n; i++){
            for(int j = 1; j < n; j++){
                arr[i][j] = arr[i][j-1] + arr[i-1][j];
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}