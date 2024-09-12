import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min = 1000;

        for(int i = 0; i < 10; i++){
            int num = sc.nextInt();

            if(num < min){
                min = num;
            }
        }
        System.out.println(min);
    }
}