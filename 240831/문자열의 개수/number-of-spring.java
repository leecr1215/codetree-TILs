import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cnt = 0;
        StringBuilder sb = new StringBuilder();

        while(true){
            String alpha = sc.next();
            if(alpha.equals("0")) break;

            cnt++;

            if(cnt % 2 != 0){
                sb.append(alpha).append("\n");
            }
        }

        System.out.println(cnt);
        System.out.println(sb.toString());
    }
}