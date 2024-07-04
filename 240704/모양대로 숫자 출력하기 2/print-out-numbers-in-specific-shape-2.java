import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // 10 미만의 짝수를 저장하는 배열
        int [] evens = new int[]{2,4,6,8};

        int cnt = 0;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(evens[cnt % 4]+" ");
                cnt++;
            }

            System.out.println();
        }

    }
}