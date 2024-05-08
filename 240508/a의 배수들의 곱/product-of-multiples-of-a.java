import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int result = 1;

        for(int i = 1; i <= b; i++){
            if(a % i == 0) result *= i;
        }

        System.out.println(result);
    }
}