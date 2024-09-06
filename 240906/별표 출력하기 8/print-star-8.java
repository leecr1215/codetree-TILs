import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 0; i < 6; i++){
            if(i % 2 == 0){
                System.out.println("*");
            }
            else{
                for(int j = 0; j <= i; j++){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}