import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 0; i < n * 2; i++){
            // 짝수
            if(i % 2 == 0){
                for(int j = 0; j < (n * 2 - i) / 2; j++){
                    System.out.print("* ");
                }
            }
            // 홀수
            else{
                for(int j = 0; j < (i + 1) / 2; j++){
                    System.out.print("* ");
                }
            }

            System.out.println();
        }
    }
}