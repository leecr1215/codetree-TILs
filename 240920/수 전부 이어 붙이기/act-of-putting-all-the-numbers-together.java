import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String str = "";

        for(int i = 0; i < n; i++){
            str += sc.next();
        }

        int idx = 0;
        while(idx + 5 < str.length()){
            System.out.println(str.substring(idx, idx+5));
            idx += 5;
        }

        System.out.println(str.substring(idx));
    }
}