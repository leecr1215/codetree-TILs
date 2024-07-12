import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 2; i <= n; i++){
            if(isPrimeNumber(i)) System.out.print(i + " ");
        }

    }

    public static boolean isPrimeNumber(int num){
        for(int i = 2; i <= (int)Math.sqrt(num); i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}