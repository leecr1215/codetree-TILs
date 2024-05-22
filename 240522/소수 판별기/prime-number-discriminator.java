import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        char result = 'P';

        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                result = 'C';
                break;
            }
        }

        System.out.println(result);
    }
}