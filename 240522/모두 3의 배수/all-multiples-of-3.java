import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cnt = 0;

        for(int i = 0; i < 5; i++){
            int num = sc.nextInt();

            if(num % 3 == 0) cnt++;
        }


        if(cnt == 5){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
}