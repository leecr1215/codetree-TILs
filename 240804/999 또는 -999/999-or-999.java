import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        while(true){
            int num = sc.nextInt();

            if(num == 999 || num == -999){
                break;
            }

            if(min > num){
                min = num;
            }

            if(max < num){
                max = num;
            }


        }

        System.out.println(max + " " + min);
        
    }
}