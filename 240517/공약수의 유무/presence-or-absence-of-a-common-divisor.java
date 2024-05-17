import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();


        boolean check = false;
        for(int i = a; i <= b; i++){
            if(1920 % i == 0 && 2880 % i == 0){
                check = true;
            }
        }

        System.out.println(check ? 1 : 0);
        
    }
}