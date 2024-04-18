import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(isUbelievable(n));
        
    }

    public static boolean isUbelievable(int n){
        return isOddAndMultipleOfThree(n) || isEvenAndMultipleOfFive(n);
    }

    public static boolean isOddAndMultipleOfThree(int n){
        return n % 2 != 0 && n % 3 == 0;
    }
   
    public static boolean isEvenAndMultipleOfFive(int n){
        return n % 2 == 0 && n % 5 == 0;
    }
}