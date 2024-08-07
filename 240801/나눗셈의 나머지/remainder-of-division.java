import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int[] count = new int[b];

        while(a > 1){
            int remainder = a % b;
            a = a / b;

            count[remainder]++;
        }

        int sum = 0;

        for(int i = 0; i < b; i++){
           sum += Math.pow(count[i], 2);
        }

        System.out.println(sum);
    }
}