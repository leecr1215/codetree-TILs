import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        System.out.print(str.contains("ee") ? "Yes " : "No ");
        System.out.println(str.contains("ab") ? "Yes" : "No");

    }
}