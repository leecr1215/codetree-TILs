import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        StringBuilder sb = new StringBuilder();

        for(int i = 1; i <= 5; i++){
            sb.append(n * i).append(" ");
        }

        System.out.println(sb.toString());
    }
}