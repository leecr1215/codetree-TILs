import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            String temp = "";

            for(int j = 0; j < n - i - 1; j++){
                temp += "  "; 
            }

            for(int j = 0; j < 2 * i + 1; j++){
                temp += "* ";
            }

            System.out.println(temp);
        }
    }
}