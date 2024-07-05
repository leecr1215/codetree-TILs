import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int evenNum = 1;
        int oddNum = 2 * n;
        for(int i = 0; i < n; i++){
            if(i % 2 == 0){
                for(int j = 0; j < n; j++){
                    System.out.print(evenNum+ j + " ");
                }
                evenNum += 2 * n;
            }

            else {
                for(int j = 0; j < n; j++){
                    System.out.print(oddNum-j + " ");
                }
                oddNum += 2 * n;
            }

            System.out.println();
        }

    }
}