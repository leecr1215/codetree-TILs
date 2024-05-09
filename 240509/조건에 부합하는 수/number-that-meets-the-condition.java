import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        boolean[] arr = new boolean[101];

        for(int i = 1; i <= a; i++){
            if(i % 2 == 0 && i % 4 != 0) continue;
            if((i / 8) % 2 == 0) continue;
            if((i % 7) < 4) continue;

            arr[i] = true;
        }

        for(int i = 1; i <= a; i++){
            if(arr[i]) System.out.printf(i + " ");
        }

    }
}