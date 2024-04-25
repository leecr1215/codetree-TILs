import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        StringBuilder sb = new StringBuilder();

        sb.append(a / b).append(".");

        a %= b;

        for(int i = 0; i < 20; i++){
            sb.append(a * 10 / b);
            a = (a * 10) % b;
        }

        System.out.println(sb.toString());

    }
}