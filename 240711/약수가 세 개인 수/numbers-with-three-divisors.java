import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int start = sc.nextInt();
        int end = sc.nextInt();

        int cnt = 0;
        for(int i = start; i <= end; i++){
            if(getDivisorCnt(i) == 3) cnt++;
        }

        System.out.println(cnt);
    }

    public static int getDivisorCnt(int num) {
        int cnt = 0;
        for(int i = 1; i <= (int)(Math.sqrt(num)); i++){
            if(num % i == 0) cnt++;
        }

        cnt = cnt * 2;

        // 중복 제거
        if(Math.sqrt(num) == (int)(Math.sqrt(num))) cnt-=1;

        return cnt;
    }
}