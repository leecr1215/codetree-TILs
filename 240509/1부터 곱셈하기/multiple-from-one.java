import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int multi = 1;
        for(int i = 1; i <= 10; i++){
            multi *= i;

            if(multi >= n){
                System.out.println(i);
                break;
            }
        }
    }
}