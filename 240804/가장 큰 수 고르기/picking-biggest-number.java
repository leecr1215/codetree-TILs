import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = 0;

        for(int i = 0; i < 10; i++){
            int num = sc.nextInt();
            if(max < num) {
                max = num;
            }
        }

        System.out.println(max);
    }
}