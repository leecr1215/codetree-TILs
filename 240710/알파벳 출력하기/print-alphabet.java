import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int cnt = 'A';
        final int MAX_CNT = 'Z';

        for(int i = 0; i < n; i++){
            for(int j = 0; j <= i; j++){
                System.out.print((char)cnt++);
                if(cnt > MAX_CNT) cnt -= 26;
            }
            System.out.println();
        }
    }
}