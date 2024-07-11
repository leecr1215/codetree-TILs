import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();

        for(int i = 0; i < m; i++){
            System.out.println(getResult(sc.nextInt()));
        }
    }

    public static int getResult(int num){
        int cnt = 0;

        while(num != 1){
            if(num % 2 == 0) num /= 2;
            else num = num * 3 + 1;
            cnt++;
        }

        return cnt;
    }
}