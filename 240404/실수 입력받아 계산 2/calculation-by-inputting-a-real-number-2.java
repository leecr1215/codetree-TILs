import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();

        System.out.println(Math.round((a+1.5) * 100) / 100.0);
    }
}