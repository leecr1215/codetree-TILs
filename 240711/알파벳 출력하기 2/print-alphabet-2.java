import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int cnt = 'A';

        for(int i = 0; i < N; i++){
            for(int j = 0; j < i; j++){
                System.out.print("  ");
            }
            for(int j = i; j < N; j++){
                if(cnt > 90) cnt = 'A';
                System.out.print((char)cnt + " ");
                cnt++;
            }
            System.out.println();
        }
    }
}