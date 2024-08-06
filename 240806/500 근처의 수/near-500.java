import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int left = 0;
        int right = 1000;

        for(int i = 0; i < 10; i++){
            int num = sc.nextInt();

            if(num < 500 && left < num){
                left = num;
            }

            else if(num > 500 && right > num){
                right = num;
            }
        }

        System.out.println(left + " " + right);
        
    }
}