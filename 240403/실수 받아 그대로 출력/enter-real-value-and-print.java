import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double n = sc.nextDouble();

        System.out.println(Math.round(n * 100) / 100.0);
    }
}