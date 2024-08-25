import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String A = sc.next();
        String B = sc.next();

        while(A.contains(B)){
            A = A.replace(B, "");
        }

        System.out.println(A);
        
    }
}