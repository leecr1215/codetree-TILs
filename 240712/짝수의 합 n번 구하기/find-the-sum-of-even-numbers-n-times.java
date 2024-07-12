import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.println(getEvensSum(a, b));
        }
        
    }

    public static int getEvensSum(int a, int b){
        int sum = 0;
        
        for(int i = a; i <= b; i++){
            if(i % 2 == 0) sum += i;
        }

        return sum;
    }
}