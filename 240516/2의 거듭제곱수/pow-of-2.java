import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int cnt = 0;
        int temp = 1;

        while(temp != n){
            temp *= 2;
            cnt++;
        }

        System.out.println(cnt);
    }
}