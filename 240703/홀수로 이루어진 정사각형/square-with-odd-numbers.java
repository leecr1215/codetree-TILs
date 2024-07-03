import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 11; i < 11 + 2*n; i+=2){
            for(int j = i; j < i + 2*n; j+=2){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}